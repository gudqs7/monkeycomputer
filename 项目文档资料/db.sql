----------------------------------------------
-- Export file for user GUDDQS              --
-- Created by Guddqs on 2016/9/25, 19:41:02 --
----------------------------------------------

spool db.log

prompt
prompt Creating table LOGIN
prompt ====================
prompt
create table GUDDQS.LOGIN
(
  LOGINID   NUMBER(4) not null,
  LOGINNAME VARCHAR2(20) not null,
  LOGINPWD  VARCHAR2(20) not null,
  ISADMIN   NUMBER(2) not null,
  STATE     NUMBER(4)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
comment on table GUDDQS.LOGIN
  is '用户登陆表';
alter table GUDDQS.LOGIN
  add constraint PK_LOGIN primary key (LOGINID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table USERADDRESS
prompt ==========================
prompt
create table GUDDQS.USERADDRESS
(
  ID        NUMBER(4) not null,
  USERID    NUMBER(4) not null,
  DEFAULTID NUMBER(4) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
comment on table GUDDQS.USERADDRESS
  is '收货地址表';
alter table GUDDQS.USERADDRESS
  add constraint PK_USERADDRESS primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table GUDDQS.USERADDRESS
  add constraint FK_USERADDR_REFERENCE_LOGIN foreign key (USERID)
  references GUDDQS.LOGIN (LOGINID);

prompt
prompt Creating table ADDRESSDETAIL
prompt ============================
prompt
create table GUDDQS.ADDRESSDETAIL
(
  ID        NUMBER(4) not null,
  ADDRESSID NUMBER(4) not null,
  USERNAME  VARCHAR2(20) not null,
  PHONE     VARCHAR2(11) not null,
  PROVINCE  VARCHAR2(10) not null,
  CITY      VARCHAR2(10) not null,
  AREA      VARCHAR2(20) not null,
  STREET    VARCHAR2(20) not null,
  DETAIL    VARCHAR2(100) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
comment on table GUDDQS.ADDRESSDETAIL
  is '收货地址详细表';
alter table GUDDQS.ADDRESSDETAIL
  add constraint PK_ADDRESSDETAIL primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table GUDDQS.ADDRESSDETAIL
  add constraint FK_ADDRESSD_REFERENCE_USERADDR foreign key (ADDRESSID)
  references GUDDQS.USERADDRESS (ID);

prompt
prompt Creating table ADVICE
prompt =====================
prompt
create table GUDDQS.ADVICE
(
  ID          NUMBER(4) not null,
  DESCRIPTION VARCHAR2(500) not null,
  USERID      NUMBER(4) not null,
  CREATETIME  DATE not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
comment on table GUDDQS.ADVICE
  is '意见投诉表';
alter table GUDDQS.ADVICE
  add constraint PK_ADVICE primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;
alter table GUDDQS.ADVICE
  add constraint FK_ADVICE_REFERENCE_LOGIN foreign key (USERID)
  references GUDDQS.LOGIN (LOGINID);

prompt
prompt Creating table LOGISTICSINFO
prompt ============================
prompt
create table GUDDQS.LOGISTICSINFO
(
  ID            NUMBER(4) not null,
  NO            VARCHAR2(20) not null,
  LOGISTICPRICE NUMBER(6,2) not null,
  LOGISTICBRAND VARCHAR2(20) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
comment on table GUDDQS.LOGISTICSINFO
  is '物流信息表';
alter table GUDDQS.LOGISTICSINFO
  add constraint PK_LOGISTICSINFO primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;

prompt
prompt Creating table ORDERS
prompt =====================
prompt
create table GUDDQS.ORDERS
(
  ID         NUMBER(4) not null,
  ORDERNUM   VARCHAR2(20) not null,
  PAYNUM     VARCHAR2(50),
  USERID     NUMBER(4) not null,
  CREATETIME DATE not null,
  SENDTIME   DATE,
  PAYTIME    DATE,
  LOGISTICID NUMBER(4),
  TOTALPRICE NUMBER(10,2) not null,
  STATE      NUMBER(2) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
comment on table GUDDQS.ORDERS
  is '订单表';
comment on column GUDDQS.ORDERS.STATE
  is '0.已取消1.未付款2.未发货3.未收货4.未评价';
alter table GUDDQS.ORDERS
  add constraint PK_ORDERS primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table GUDDQS.ORDERS
  add constraint FK_ORDERS_REFERENCE_LOGIN foreign key (USERID)
  references GUDDQS.LOGIN (LOGINID);
alter table GUDDQS.ORDERS
  add constraint FK_ORDERS_REFERENCE_LOGISTIC foreign key (LOGISTICID)
  references GUDDQS.LOGISTICSINFO (ID);
create unique index GUDDQS.UNIQUE_ORDERNUM on GUDDQS.ORDERS (ORDERNUM)
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table PRODUCTTTYPE
prompt ===========================
prompt
create table GUDDQS.PRODUCTTTYPE
(
  ID       NUMBER(4) not null,
  NAME     VARCHAR2(50) not null,
  PARENTID NUMBER(4)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
comment on table GUDDQS.PRODUCTTTYPE
  is '商品类别表';
alter table GUDDQS.PRODUCTTTYPE
  add constraint PK_PRODUCTTTYPE primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table GUDDQS.PRODUCTTTYPE
  add constraint FK_PRODUCTT_REFERENCE_PRODUCTT foreign key (PARENTID)
  references GUDDQS.PRODUCTTTYPE (ID);

prompt
prompt Creating table PRODUCT
prompt ======================
prompt
create table GUDDQS.PRODUCT
(
  ID         NUMBER(4) not null,
  NAME       VARCHAR2(20) not null,
  PRICE      NUMBER(6,2) not null,
  STOCK      NUMBER(4) not null,
  PICTURE    VARCHAR2(250) not null,
  POINT      NUMBER(4) not null,
  SIMPLEDESC VARCHAR2(50) not null,
  DETIALDESC VARCHAR2(2000),
  TYPEID     NUMBER(4) not null,
  STATE      NUMBER(4) not null,
  SALES      NUMBER(4)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
comment on table GUDDQS.PRODUCT
  is '商品表';
alter table GUDDQS.PRODUCT
  add constraint PK_PRODUCT primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table GUDDQS.PRODUCT
  add constraint FK_PRODUCT_REFERENCE_PRODUCTT foreign key (TYPEID)
  references GUDDQS.PRODUCTTTYPE (ID);

prompt
prompt Creating table AFTERSALE
prompt ========================
prompt
create table GUDDQS.AFTERSALE
(
  ID          NUMBER(4) not null,
  ORDERID     NUMBER(4) not null,
  PRODUCTID   NUMBER(4) not null,
  TYPE        NUMBER(4),
  REFUNDPRICE NUMBER(6,2) not null,
  COPY        VARCHAR2(500) not null,
  STATE       NUMBER(4),
  LOGISTICID  NUMBER(4)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
comment on table GUDDQS.AFTERSALE
  is '售后申请表';
alter table GUDDQS.AFTERSALE
  add constraint PK_AFTERSALE primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;
alter table GUDDQS.AFTERSALE
  add constraint FK_AFTERSAL_REFERENCE_LOGISTIC foreign key (LOGISTICID)
  references GUDDQS.LOGISTICSINFO (ID);
alter table GUDDQS.AFTERSALE
  add constraint FK_AFTERSAL_REFERENCE_ORDERS foreign key (ORDERID)
  references GUDDQS.ORDERS (ID);
alter table GUDDQS.AFTERSALE
  add constraint FK_AFTERSAL_REFERENCE_PRODUCT foreign key (PRODUCTID)
  references GUDDQS.PRODUCT (ID);

prompt
prompt Creating table ANNOUNCEMENT
prompt ===========================
prompt
create table GUDDQS.ANNOUNCEMENT
(
  ID          NUMBER(4) not null,
  TITLE       VARCHAR2(20) not null,
  DESCRIPTION VARCHAR2(500) not null,
  RELEASETIME DATE not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
comment on table GUDDQS.ANNOUNCEMENT
  is '系统公告表';
alter table GUDDQS.ANNOUNCEMENT
  add constraint PK_ANNOUNCEMENT primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;

prompt
prompt Creating table CART
prompt ===================
prompt
create table GUDDQS.CART
(
  ID               NUMBER(4) not null,
  USERID           NUMBER(4) not null,
  PRODUCTID        NUMBER(4) not null,
  NUM              NUMBER(4) not null,
  PRODUCTPACKAGEID NUMBER(4)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
comment on table GUDDQS.CART
  is '购物车信息表';
alter table GUDDQS.CART
  add constraint PK_CART primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table GUDDQS.CART
  add constraint FK_CART_REFERENCE_LOGIN foreign key (USERID)
  references GUDDQS.LOGIN (LOGINID);
alter table GUDDQS.CART
  add constraint FK_CART_REFERENCE_PRODUCT foreign key (PRODUCTID)
  references GUDDQS.PRODUCT (ID);

prompt
prompt Creating table COMPUTERKNOWLEDGE
prompt ================================
prompt
create table GUDDQS.COMPUTERKNOWLEDGE
(
  ID      NUMBER(4) not null,
  TITLE   VARCHAR2(20) not null,
  DETAIL  VARCHAR2(500) not null,
  NEEDFUL NUMBER(4) not null,
  BADFUL  NUMBER(4) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
comment on table GUDDQS.COMPUTERKNOWLEDGE
  is '电脑常识表';
alter table GUDDQS.COMPUTERKNOWLEDGE
  add constraint PK_COMPUTERKNOWLEDGE primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;

prompt
prompt Creating table EVALUATION
prompt =========================
prompt
create table GUDDQS.EVALUATION
(
  ID             NUMBER(4) not null,
  ORDERID        NUMBER(4) not null,
  DESCRIPTION    VARCHAR2(500),
  PICS           VARCHAR2(1000),
  PRODUCTLEVEL   NUMBER(4) not null,
  SENDLEVEL      NUMBER(4) not null,
  LOGISTICSLEVEL NUMBER(4) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
comment on table GUDDQS.EVALUATION
  is '商品评价表';
alter table GUDDQS.EVALUATION
  add constraint PK_EVALUATION primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;
alter table GUDDQS.EVALUATION
  add constraint FK_EVALUATI_REFERENCE_ORDERS foreign key (ORDERID)
  references GUDDQS.ORDERS (ID);

prompt
prompt Creating table HISTORYRECORD
prompt ============================
prompt
create table GUDDQS.HISTORYRECORD
(
  ID        NUMBER(4) not null,
  PRODUCTID NUMBER(4) not null,
  LOOKTIME  DATE not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
comment on table GUDDQS.HISTORYRECORD
  is '浏览记录表';
alter table GUDDQS.HISTORYRECORD
  add constraint PK_HISTORYRECORD primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;
alter table GUDDQS.HISTORYRECORD
  add constraint FK_HISTORYR_REFERENCE_PRODUCT foreign key (PRODUCTID)
  references GUDDQS.PRODUCT (ID);

prompt
prompt Creating table MESSAGE
prompt ======================
prompt
create table GUDDQS.MESSAGE
(
  ID          NUMBER(4) not null,
  USERID      NUMBER(4) not null,
  TYPE        NUMBER(2) not null,
  TITLE       VARCHAR2(20) not null,
  DESCRIPTION VARCHAR2(250) not null,
  CREATETIIME DATE not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
comment on table GUDDQS.MESSAGE
  is '信息提醒表';
alter table GUDDQS.MESSAGE
  add constraint PK_MESSAGE primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;
alter table GUDDQS.MESSAGE
  add constraint FK_MESSAGE_REFERENCE_LOGIN foreign key (USERID)
  references GUDDQS.LOGIN (LOGINID);

prompt
prompt Creating table ORDERSDETAIL
prompt ===========================
prompt
create table GUDDQS.ORDERSDETAIL
(
  ID               NUMBER(4) not null,
  ORDERID          NUMBER(4),
  PRODUCTID        NUMBER(4) not null,
  NUM              NUMBER(4) not null,
  PRODUCTPACKAGEID NUMBER(4)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
comment on table GUDDQS.ORDERSDETAIL
  is '订单详细表';
alter table GUDDQS.ORDERSDETAIL
  add constraint PK_ORDERSDETAIL primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table GUDDQS.ORDERSDETAIL
  add constraint FK_ORDERSDE_REFERENCE_ORDERS foreign key (ORDERID)
  references GUDDQS.ORDERS (ID);
alter table GUDDQS.ORDERSDETAIL
  add constraint FK_ORDERSDE_REFERENCE_PRODUCT foreign key (PRODUCTID)
  references GUDDQS.PRODUCT (ID);

prompt
prompt Creating table PRODUCTPACKAGE
prompt =============================
prompt
create table GUDDQS.PRODUCTPACKAGE
(
  ID        NUMBER(4) not null,
  PRODUCTID NUMBER(4) not null,
  DEFAULTID NUMBER(4)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
comment on table GUDDQS.PRODUCTPACKAGE
  is '商品套餐表';
alter table GUDDQS.PRODUCTPACKAGE
  add constraint PK_PRODUCTPACKAGE primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table GUDDQS.PRODUCTPACKAGE
  add constraint FK_PRODUCTP_REFERENCE_PRODUCT foreign key (PRODUCTID)
  references GUDDQS.PRODUCT (ID);

prompt
prompt Creating table PACKAGEDETAIL
prompt ============================
prompt
create table GUDDQS.PACKAGEDETAIL
(
  ID        NUMBER(4) not null,
  PACKAGEID NUMBER(4) not null,
  NAME      VARCHAR2(20) not null,
  PRICE     NUMBER(6,2) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
comment on table GUDDQS.PACKAGEDETAIL
  is '套餐详细表';
alter table GUDDQS.PACKAGEDETAIL
  add constraint PK_PACKAGEDETAIL primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table GUDDQS.PACKAGEDETAIL
  add constraint FK_PACKAGED_REFERENCE_PRODUCTP foreign key (PACKAGEID)
  references GUDDQS.PRODUCTPACKAGE (ID);

prompt
prompt Creating table PICPRODUCT
prompt =========================
prompt
create table GUDDQS.PICPRODUCT
(
  ID        NUMBER(4) not null,
  PRODUCTID NUMBER(4) not null,
  PICTURE   VARCHAR2(250) not null,
  TIP       VARCHAR2(50)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
comment on table GUDDQS.PICPRODUCT
  is '首页商品图框表';
alter table GUDDQS.PICPRODUCT
  add constraint PK_PICPRODUCT primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table GUDDQS.PICPRODUCT
  add constraint FK_PICPRODU_REFERENCE_PRODUCT foreign key (PRODUCTID)
  references GUDDQS.PRODUCT (ID);

prompt
prompt Creating table PRODUCTCOLLECTION
prompt ================================
prompt
create table GUDDQS.PRODUCTCOLLECTION
(
  ID        NUMBER(4) not null,
  PRODUCTID NUMBER(4) not null,
  REMARKS   VARCHAR2(30)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
comment on table GUDDQS.PRODUCTCOLLECTION
  is '商品收藏表';
alter table GUDDQS.PRODUCTCOLLECTION
  add constraint PK_PRODUCTCOLLECTION primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;
alter table GUDDQS.PRODUCTCOLLECTION
  add constraint FK_PRODUCTC_REFERENCE_PRODUCT foreign key (PRODUCTID)
  references GUDDQS.PRODUCT (ID);

prompt
prompt Creating table USERINFO
prompt =======================
prompt
create table GUDDQS.USERINFO
(
  ID         NUMBER(4) not null,
  USERID     NUMBER(4) not null,
  REALNAME   VARCHAR2(20),
  GENDER     CHAR(3) not null,
  PHONE      VARCHAR2(11) not null,
  EMAIL      VARCHAR2(50) not null,
  BIRTHDAY   DATE,
  REGISTTIME DATE not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
comment on table GUDDQS.USERINFO
  is '用户个人信息表';
alter table GUDDQS.USERINFO
  add constraint PK_USERINFO primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table GUDDQS.USERINFO
  add constraint FK_USERINFO_REFERENCE_LOGIN foreign key (USERID)
  references GUDDQS.LOGIN (LOGINID);
create unique index GUDDQS.INDEX_1 on GUDDQS.USERINFO (USERID)
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating sequence SEQ_MONKEY
prompt ============================
prompt
create sequence GUDDQS.SEQ_MONKEY
minvalue 1
maxvalue 9999999999999999999999999999
start with 201
increment by 1
cache 20;


spool off
