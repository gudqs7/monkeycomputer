prompt PL/SQL Developer import file
prompt Created on 2016年9月25日 by Guddqs
set feedback off
set define off
prompt Disabling triggers for LOGIN...
alter table LOGIN disable all triggers;
prompt Disabling triggers for USERADDRESS...
alter table USERADDRESS disable all triggers;
prompt Disabling triggers for ADDRESSDETAIL...
alter table ADDRESSDETAIL disable all triggers;
prompt Disabling triggers for ADVICE...
alter table ADVICE disable all triggers;
prompt Disabling triggers for LOGISTICSINFO...
alter table LOGISTICSINFO disable all triggers;
prompt Disabling triggers for ORDERS...
alter table ORDERS disable all triggers;
prompt Disabling triggers for PRODUCTTTYPE...
alter table PRODUCTTTYPE disable all triggers;
prompt Disabling triggers for PRODUCT...
alter table PRODUCT disable all triggers;
prompt Disabling triggers for AFTERSALE...
alter table AFTERSALE disable all triggers;
prompt Disabling triggers for ANNOUNCEMENT...
alter table ANNOUNCEMENT disable all triggers;
prompt Disabling triggers for CART...
alter table CART disable all triggers;
prompt Disabling triggers for COMPUTERKNOWLEDGE...
alter table COMPUTERKNOWLEDGE disable all triggers;
prompt Disabling triggers for EVALUATION...
alter table EVALUATION disable all triggers;
prompt Disabling triggers for HISTORYRECORD...
alter table HISTORYRECORD disable all triggers;
prompt Disabling triggers for MESSAGE...
alter table MESSAGE disable all triggers;
prompt Disabling triggers for ORDERSDETAIL...
alter table ORDERSDETAIL disable all triggers;
prompt Disabling triggers for PRODUCTPACKAGE...
alter table PRODUCTPACKAGE disable all triggers;
prompt Disabling triggers for PACKAGEDETAIL...
alter table PACKAGEDETAIL disable all triggers;
prompt Disabling triggers for PICPRODUCT...
alter table PICPRODUCT disable all triggers;
prompt Disabling triggers for PRODUCTCOLLECTION...
alter table PRODUCTCOLLECTION disable all triggers;
prompt Disabling triggers for USERINFO...
alter table USERINFO disable all triggers;
prompt Disabling foreign key constraints for USERADDRESS...
alter table USERADDRESS disable constraint FK_USERADDR_REFERENCE_LOGIN;
prompt Disabling foreign key constraints for ADDRESSDETAIL...
alter table ADDRESSDETAIL disable constraint FK_ADDRESSD_REFERENCE_USERADDR;
prompt Disabling foreign key constraints for ADVICE...
alter table ADVICE disable constraint FK_ADVICE_REFERENCE_LOGIN;
prompt Disabling foreign key constraints for ORDERS...
alter table ORDERS disable constraint FK_ORDERS_REFERENCE_LOGIN;
alter table ORDERS disable constraint FK_ORDERS_REFERENCE_LOGISTIC;
prompt Disabling foreign key constraints for PRODUCTTTYPE...
alter table PRODUCTTTYPE disable constraint FK_PRODUCTT_REFERENCE_PRODUCTT;
prompt Disabling foreign key constraints for PRODUCT...
alter table PRODUCT disable constraint FK_PRODUCT_REFERENCE_PRODUCTT;
prompt Disabling foreign key constraints for AFTERSALE...
alter table AFTERSALE disable constraint FK_AFTERSAL_REFERENCE_LOGISTIC;
alter table AFTERSALE disable constraint FK_AFTERSAL_REFERENCE_ORDERS;
alter table AFTERSALE disable constraint FK_AFTERSAL_REFERENCE_PRODUCT;
prompt Disabling foreign key constraints for CART...
alter table CART disable constraint FK_CART_REFERENCE_LOGIN;
alter table CART disable constraint FK_CART_REFERENCE_PRODUCT;
prompt Disabling foreign key constraints for EVALUATION...
alter table EVALUATION disable constraint FK_EVALUATI_REFERENCE_ORDERS;
prompt Disabling foreign key constraints for HISTORYRECORD...
alter table HISTORYRECORD disable constraint FK_HISTORYR_REFERENCE_PRODUCT;
prompt Disabling foreign key constraints for MESSAGE...
alter table MESSAGE disable constraint FK_MESSAGE_REFERENCE_LOGIN;
prompt Disabling foreign key constraints for ORDERSDETAIL...
alter table ORDERSDETAIL disable constraint FK_ORDERSDE_REFERENCE_ORDERS;
alter table ORDERSDETAIL disable constraint FK_ORDERSDE_REFERENCE_PRODUCT;
prompt Disabling foreign key constraints for PRODUCTPACKAGE...
alter table PRODUCTPACKAGE disable constraint FK_PRODUCTP_REFERENCE_PRODUCT;
prompt Disabling foreign key constraints for PACKAGEDETAIL...
alter table PACKAGEDETAIL disable constraint FK_PACKAGED_REFERENCE_PRODUCTP;
prompt Disabling foreign key constraints for PICPRODUCT...
alter table PICPRODUCT disable constraint FK_PICPRODU_REFERENCE_PRODUCT;
prompt Disabling foreign key constraints for PRODUCTCOLLECTION...
alter table PRODUCTCOLLECTION disable constraint FK_PRODUCTC_REFERENCE_PRODUCT;
prompt Disabling foreign key constraints for USERINFO...
alter table USERINFO disable constraint FK_USERINFO_REFERENCE_LOGIN;
prompt Deleting USERINFO...
delete from USERINFO;
commit;
prompt Deleting PRODUCTCOLLECTION...
delete from PRODUCTCOLLECTION;
commit;
prompt Deleting PICPRODUCT...
delete from PICPRODUCT;
commit;
prompt Deleting PACKAGEDETAIL...
delete from PACKAGEDETAIL;
commit;
prompt Deleting PRODUCTPACKAGE...
delete from PRODUCTPACKAGE;
commit;
prompt Deleting ORDERSDETAIL...
delete from ORDERSDETAIL;
commit;
prompt Deleting MESSAGE...
delete from MESSAGE;
commit;
prompt Deleting HISTORYRECORD...
delete from HISTORYRECORD;
commit;
prompt Deleting EVALUATION...
delete from EVALUATION;
commit;
prompt Deleting COMPUTERKNOWLEDGE...
delete from COMPUTERKNOWLEDGE;
commit;
prompt Deleting CART...
delete from CART;
commit;
prompt Deleting ANNOUNCEMENT...
delete from ANNOUNCEMENT;
commit;
prompt Deleting AFTERSALE...
delete from AFTERSALE;
commit;
prompt Deleting PRODUCT...
delete from PRODUCT;
commit;
prompt Deleting PRODUCTTTYPE...
delete from PRODUCTTTYPE;
commit;
prompt Deleting ORDERS...
delete from ORDERS;
commit;
prompt Deleting LOGISTICSINFO...
delete from LOGISTICSINFO;
commit;
prompt Deleting ADVICE...
delete from ADVICE;
commit;
prompt Deleting ADDRESSDETAIL...
delete from ADDRESSDETAIL;
commit;
prompt Deleting USERADDRESS...
delete from USERADDRESS;
commit;
prompt Deleting LOGIN...
delete from LOGIN;
commit;
prompt Loading LOGIN...
insert into LOGIN (LOGINID, LOGINNAME, LOGINPWD, ISADMIN, STATE)
values (121, 'rrr', 'rrr', 0, 1);
insert into LOGIN (LOGINID, LOGINNAME, LOGINPWD, ISADMIN, STATE)
values (13, 'guddqs', 'ggg', 1, 1);
insert into LOGIN (LOGINID, LOGINNAME, LOGINPWD, ISADMIN, STATE)
values (148, '。。。', 'ttt', 0, 0);
insert into LOGIN (LOGINID, LOGINNAME, LOGINPWD, ISADMIN, STATE)
values (150, 'killqunzhu', '1234567', 0, 0);
insert into LOGIN (LOGINID, LOGINNAME, LOGINPWD, ISADMIN, STATE)
values (153, '黄大叔', 'da', 0, 0);
insert into LOGIN (LOGINID, LOGINNAME, LOGINPWD, ISADMIN, STATE)
values (160, 'tom', '123456', 0, 0);
insert into LOGIN (LOGINID, LOGINNAME, LOGINPWD, ISADMIN, STATE)
values (164, 'away', 'qq', 0, 1);
insert into LOGIN (LOGINID, LOGINNAME, LOGINPWD, ISADMIN, STATE)
values (35, 'sbw', 'sss', 0, 1);
insert into LOGIN (LOGINID, LOGINNAME, LOGINPWD, ISADMIN, STATE)
values (94, 'adc', 'adc', 0, 1);
insert into LOGIN (LOGINID, LOGINNAME, LOGINPWD, ISADMIN, STATE)
values (97, 'adc', 'adc', 0, 0);
insert into LOGIN (LOGINID, LOGINNAME, LOGINPWD, ISADMIN, STATE)
values (99, 'adc', 'adc', 0, 0);
insert into LOGIN (LOGINID, LOGINNAME, LOGINPWD, ISADMIN, STATE)
values (103, 'aa', 'aa', 0, 0);
insert into LOGIN (LOGINID, LOGINNAME, LOGINPWD, ISADMIN, STATE)
values (105, 'adc', 'adc', 0, 0);
insert into LOGIN (LOGINID, LOGINNAME, LOGINPWD, ISADMIN, STATE)
values (111, '马云', 'mayun123', 0, 0);
insert into LOGIN (LOGINID, LOGINNAME, LOGINPWD, ISADMIN, STATE)
values (113, '马云', 'mayun123', 0, 0);
insert into LOGIN (LOGINID, LOGINNAME, LOGINPWD, ISADMIN, STATE)
values (169, 'wolaile', 'wolaile', 0, 1);
insert into LOGIN (LOGINID, LOGINNAME, LOGINPWD, ISADMIN, STATE)
values (144, 'xiaoyu', '123456', 0, 1);
insert into LOGIN (LOGINID, LOGINNAME, LOGINPWD, ISADMIN, STATE)
values (80, '13135', 'kkk', 0, 0);
insert into LOGIN (LOGINID, LOGINNAME, LOGINPWD, ISADMIN, STATE)
values (107, 'ddd', 'asdf', 0, 1);
insert into LOGIN (LOGINID, LOGINNAME, LOGINPWD, ISADMIN, STATE)
values (146, '。。。', 'ttt', 0, 0);
insert into LOGIN (LOGINID, LOGINNAME, LOGINPWD, ISADMIN, STATE)
values (156, 'aag', 'ga', 0, 0);
insert into LOGIN (LOGINID, LOGINNAME, LOGINPWD, ISADMIN, STATE)
values (101, 'adc', 'adc', 0, 0);
insert into LOGIN (LOGINID, LOGINNAME, LOGINPWD, ISADMIN, STATE)
values (162, '孙步文', 'shmily5201314', 0, 0);
insert into LOGIN (LOGINID, LOGINNAME, LOGINPWD, ISADMIN, STATE)
values (109, 'xnn', 'xnn', 0, 0);
insert into LOGIN (LOGINID, LOGINNAME, LOGINPWD, ISADMIN, STATE)
values (167, '1156897969', '123456', 0, 0);
commit;
prompt 25 records loaded
prompt Loading USERADDRESS...
insert into USERADDRESS (ID, USERID, DEFAULTID)
values (1, 35, 1);
insert into USERADDRESS (ID, USERID, DEFAULTID)
values (39, 13, 40);
insert into USERADDRESS (ID, USERID, DEFAULTID)
values (171, 169, 0);
commit;
prompt 3 records loaded
prompt Loading ADDRESSDETAIL...
insert into ADDRESSDETAIL (ID, ADDRESSID, USERNAME, PHONE, PROVINCE, CITY, AREA, STREET, DETAIL)
values (40, 39, 'guddqs', '18670321728', '北京', '北京', '西城', '老胡同', '没有写减肥健康的减肥的');
insert into ADDRESSDETAIL (ID, ADDRESSID, USERNAME, PHONE, PROVINCE, CITY, AREA, STREET, DETAIL)
values (1, 1, '小白发', '18699992222', '湖南', '长沙', '开服区', '芙蓉北路', '湘江世界城3楼');
insert into ADDRESSDETAIL (ID, ADDRESSID, USERNAME, PHONE, PROVINCE, CITY, AREA, STREET, DETAIL)
values (2, 1, '更改是', '12345678901', '湖北', '武汉', '接口', '卡卡的', '科技发达看吧');
commit;
prompt 3 records loaded
prompt Loading ADVICE...
prompt Table is empty
prompt Loading LOGISTICSINFO...
prompt Table is empty
prompt Loading ORDERS...
insert into ORDERS (ID, ORDERNUM, PAYNUM, USERID, CREATETIME, SENDTIME, PAYTIME, LOGISTICID, TOTALPRICE, STATE)
values (64, '5d75c63b-d2cd-4acd', null, 35, to_date('16-08-2016 18:09:29', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, 2122, 2);
insert into ORDERS (ID, ORDERNUM, PAYNUM, USERID, CREATETIME, SENDTIME, PAYTIME, LOGISTICID, TOTALPRICE, STATE)
values (33, '5d75c63b-d2cd-4acs', null, 35, to_date('17-08-2016 17:19:27', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, 8888.25, 2);
insert into ORDERS (ID, ORDERNUM, PAYNUM, USERID, CREATETIME, SENDTIME, PAYTIME, LOGISTICID, TOTALPRICE, STATE)
values (67, '619ef381-1e19-4eca', null, 35, to_date('16-08-2016 19:41:02', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, 2445, 2);
insert into ORDERS (ID, ORDERNUM, PAYNUM, USERID, CREATETIME, SENDTIME, PAYTIME, LOGISTICID, TOTALPRICE, STATE)
values (72, '0180a047-ccf3-4eeb', null, 35, to_date('16-08-2016 19:48:52', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, 1934, 2);
insert into ORDERS (ID, ORDERNUM, PAYNUM, USERID, CREATETIME, SENDTIME, PAYTIME, LOGISTICID, TOTALPRICE, STATE)
values (87, '79d40880-90e5-4629', null, 35, to_date('17-08-2016 17:20:12', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, 7897, 2);
insert into ORDERS (ID, ORDERNUM, PAYNUM, USERID, CREATETIME, SENDTIME, PAYTIME, LOGISTICID, TOTALPRICE, STATE)
values (92, 'd7805c0a-0348-4a64', null, 35, to_date('17-08-2016 18:35:42', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, 963, 2);
insert into ORDERS (ID, ORDERNUM, PAYNUM, USERID, CREATETIME, SENDTIME, PAYTIME, LOGISTICID, TOTALPRICE, STATE)
values (182, 'bfe03e1a-b27a-4928', null, 35, to_date('02-09-2016 16:14:02', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, 2399, 2);
insert into ORDERS (ID, ORDERNUM, PAYNUM, USERID, CREATETIME, SENDTIME, PAYTIME, LOGISTICID, TOTALPRICE, STATE)
values (82, '865b55ec-ce70-4109', null, 35, to_date('17-08-2016 17:06:43', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, 2399, 2);
insert into ORDERS (ID, ORDERNUM, PAYNUM, USERID, CREATETIME, SENDTIME, PAYTIME, LOGISTICID, TOTALPRICE, STATE)
values (77, '532e03c6-6cb8-4d65', null, 35, to_date('16-08-2016 20:01:09', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, 6366, 2);
insert into ORDERS (ID, ORDERNUM, PAYNUM, USERID, CREATETIME, SENDTIME, PAYTIME, LOGISTICID, TOTALPRICE, STATE)
values (176, '2d6e2180-1f2b-45ca', null, 35, to_date('01-09-2016 11:41:00', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, 3099, 2);
insert into ORDERS (ID, ORDERNUM, PAYNUM, USERID, CREATETIME, SENDTIME, PAYTIME, LOGISTICID, TOTALPRICE, STATE)
values (180, '69add821-8078-46ee', null, 35, to_date('02-09-2016 13:11:11', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, 21591, 2);
commit;
prompt 11 records loaded
prompt Loading PRODUCTTTYPE...
insert into PRODUCTTTYPE (ID, NAME, PARENTID)
values (6, 'ProductType_6', 1);
insert into PRODUCTTTYPE (ID, NAME, PARENTID)
values (7, 'ProductType_7', 2);
insert into PRODUCTTTYPE (ID, NAME, PARENTID)
values (8, 'ProductType_8', 3);
insert into PRODUCTTTYPE (ID, NAME, PARENTID)
values (9, 'ProductType_9', 4);
insert into PRODUCTTTYPE (ID, NAME, PARENTID)
values (10, 'ProductType_10', 5);
insert into PRODUCTTTYPE (ID, NAME, PARENTID)
values (11, 'ProductType_11', 1);
insert into PRODUCTTTYPE (ID, NAME, PARENTID)
values (12, 'ProductType_12', 2);
insert into PRODUCTTTYPE (ID, NAME, PARENTID)
values (13, 'ProductType_13', 3);
insert into PRODUCTTTYPE (ID, NAME, PARENTID)
values (14, 'ProductType_14', 4);
insert into PRODUCTTTYPE (ID, NAME, PARENTID)
values (15, 'ProductType_15', 5);
insert into PRODUCTTTYPE (ID, NAME, PARENTID)
values (3, 'ProductType_3', null);
insert into PRODUCTTTYPE (ID, NAME, PARENTID)
values (4, 'ProductType_4', null);
insert into PRODUCTTTYPE (ID, NAME, PARENTID)
values (5, 'ProductType_5', null);
insert into PRODUCTTTYPE (ID, NAME, PARENTID)
values (1, 'ProductType_1', null);
insert into PRODUCTTTYPE (ID, NAME, PARENTID)
values (2, 'ProductType_2', null);
commit;
prompt 15 records loaded
prompt Loading PRODUCT...
insert into PRODUCT (ID, NAME, PRICE, STOCK, PICTURE, POINT, SIMPLEDESC, DETIALDESC, TYPEID, STATE, SALES)
values (1, '锋麦S', 3799, 9999, 'gg.jpg', 50, 'QRTECH 麦本本 锋麦S GTX960M独显i5游戏本', '证书编号：2016010902837621证书状态：有效申请人名称：同方国际信息技术（苏州）有限公司制造商名称：深圳琪润数码科技有限公司产品名称：笔记本电脑3C产品型号：锋麦******,黑麦******,京麦******,灵麦******(*代表0-9，A-Z,a-z...产品名称：QRTECH 麦本本 锋麦S能效等级: 一级品牌: QRTECH型号: 锋麦S屏幕尺寸: 15.6英寸CPU: i5-4300M显卡类型: 独立显卡显存容量: 2GB机械硬盘容量: 无机械硬盘内存容量: 4GB', 6, 1, 3333);
insert into PRODUCT (ID, NAME, PRICE, STOCK, PICTURE, POINT, SIMPLEDESC, DETIALDESC, TYPEID, STATE, SALES)
values (2, '大麦3S', 3099, 3333, '3s.jpg', 33, 'i5超薄 2G独显游戏 笔记本电脑 ', '品牌名称：QRTECH关注' || chr(10) || '更多参数产品参数：' || chr(10) || '证书编号：2015010902809418证书状态：有效申请人名称：深圳琪润数码科技有限公司制造商名称：深圳琪润数码科技有限公司产品名称：笔记本电脑3C产品型号：大麦***************、小麦***************、金麦************...产品名称：QRTECH 麦本本 大麦3能效等级: 一级品牌: QRTECH型号: 大麦3屏幕尺寸: 15.6英寸CPU: Core/酷睿 i5显卡类型: 独立显卡--NVIDIA GeForce 940M显存容量: 2GB机械硬盘容量: 无机械硬盘内存容量: 4GB', 7, 1, 42);
insert into PRODUCT (ID, NAME, PRICE, STOCK, PICTURE, POINT, SIMPLEDESC, DETIALDESC, TYPEID, STATE, SALES)
values (3, '金麦3S', 2399, 4735, 'jin3s.jpg', 12, '独立显卡 7色外观定制 轻薄便携', '证书编号：2015010902787222证书状态：有效产品名称：笔记本电脑产品名称：QRTECH 麦本本 金麦能效等级: 二级品牌: QRTECH型号: 金麦屏幕尺寸: 14英寸CPU: Intel Core/酷睿 i3显卡类型: 独立显卡显存容量: 1GB机械硬盘容量: 120GB内存容量: 8GB操作系统: DOS', 8, 1, 321);
commit;
prompt 3 records loaded
prompt Loading AFTERSALE...
prompt Table is empty
prompt Loading ANNOUNCEMENT...
prompt Table is empty
prompt Loading CART...
insert into CART (ID, USERID, PRODUCTID, NUM, PRODUCTPACKAGEID)
values (166, 164, 3, 4, 0);
insert into CART (ID, USERID, PRODUCTID, NUM, PRODUCTPACKAGEID)
values (184, 35, 3, 3, 0);
commit;
prompt 2 records loaded
prompt Loading COMPUTERKNOWLEDGE...
prompt Table is empty
prompt Loading EVALUATION...
prompt Table is empty
prompt Loading HISTORYRECORD...
prompt Table is empty
prompt Loading MESSAGE...
prompt Table is empty
prompt Loading ORDERSDETAIL...
insert into ORDERSDETAIL (ID, ORDERID, PRODUCTID, NUM, PRODUCTPACKAGEID)
values (65, 64, 1, 1, 1);
insert into ORDERSDETAIL (ID, ORDERID, PRODUCTID, NUM, PRODUCTPACKAGEID)
values (68, 67, 1, 1, 3);
insert into ORDERSDETAIL (ID, ORDERID, PRODUCTID, NUM, PRODUCTPACKAGEID)
values (69, 67, 1, 1, 1);
insert into ORDERSDETAIL (ID, ORDERID, PRODUCTID, NUM, PRODUCTPACKAGEID)
values (73, 72, 1, 4, 3);
insert into ORDERSDETAIL (ID, ORDERID, PRODUCTID, NUM, PRODUCTPACKAGEID)
values (74, 72, 1, 2, 2);
insert into ORDERSDETAIL (ID, ORDERID, PRODUCTID, NUM, PRODUCTPACKAGEID)
values (88, 87, 3, 2, 0);
insert into ORDERSDETAIL (ID, ORDERID, PRODUCTID, NUM, PRODUCTPACKAGEID)
values (89, 87, 2, 1, 0);
insert into ORDERSDETAIL (ID, ORDERID, PRODUCTID, NUM, PRODUCTPACKAGEID)
values (93, 92, 1, 3, 2);
insert into ORDERSDETAIL (ID, ORDERID, PRODUCTID, NUM, PRODUCTPACKAGEID)
values (183, 182, 3, 1, 0);
insert into ORDERSDETAIL (ID, ORDERID, PRODUCTID, NUM, PRODUCTPACKAGEID)
values (83, 82, 3, 1, 0);
insert into ORDERSDETAIL (ID, ORDERID, PRODUCTID, NUM, PRODUCTPACKAGEID)
values (78, 77, 1, 3, 1);
insert into ORDERSDETAIL (ID, ORDERID, PRODUCTID, NUM, PRODUCTPACKAGEID)
values (177, 176, 2, 1, 0);
insert into ORDERSDETAIL (ID, ORDERID, PRODUCTID, NUM, PRODUCTPACKAGEID)
values (181, 180, 3, 9, 0);
commit;
prompt 13 records loaded
prompt Loading PRODUCTPACKAGE...
insert into PRODUCTPACKAGE (ID, PRODUCTID, DEFAULTID)
values (1, 1, 1);
commit;
prompt 1 records loaded
prompt Loading PACKAGEDETAIL...
insert into PACKAGEDETAIL (ID, PACKAGEID, NAME, PRICE)
values (1, 1, '套餐一', 2122);
insert into PACKAGEDETAIL (ID, PACKAGEID, NAME, PRICE)
values (2, 1, '套餐二', 321);
insert into PACKAGEDETAIL (ID, PACKAGEID, NAME, PRICE)
values (3, 1, '套餐三', 323);
commit;
prompt 3 records loaded
prompt Loading PICPRODUCT...
insert into PICPRODUCT (ID, PRODUCTID, PICTURE, TIP)
values (2, 2, '3s.jpg', '大麦3s');
insert into PICPRODUCT (ID, PRODUCTID, PICTURE, TIP)
values (3, 3, 'jin3s.jpg', '金麦3s');
insert into PICPRODUCT (ID, PRODUCTID, PICTURE, TIP)
values (1, 1, 'gg.jpg', '锋麦s');
commit;
prompt 3 records loaded
prompt Loading PRODUCTCOLLECTION...
prompt Table is empty
prompt Loading USERINFO...
insert into USERINFO (ID, USERID, REALNAME, GENDER, PHONE, EMAIL, BIRTHDAY, REGISTTIME)
values (14, 13, '管理员', '男', '119', 'guddqs@guddqs.com', to_date('01-01-2011', 'dd-mm-yyyy'), to_date('11-08-2016 12:02:03', 'dd-mm-yyyy hh24:mi:ss'));
insert into USERINFO (ID, USERID, REALNAME, GENDER, PHONE, EMAIL, BIRTHDAY, REGISTTIME)
values (122, 121, 'adf', '男', '18670321728', '768446359@qq.com', to_date('09-09-2013', 'dd-mm-yyyy'), to_date('23-08-2016 15:31:56', 'dd-mm-yyyy hh24:mi:ss'));
insert into USERINFO (ID, USERID, REALNAME, GENDER, PHONE, EMAIL, BIRTHDAY, REGISTTIME)
values (149, 148, '123', '男', '18670321728', '768446359@qq.com', to_date('01-01-2012', 'dd-mm-yyyy'), to_date('31-08-2016 18:04:21', 'dd-mm-yyyy hh24:mi:ss'));
insert into USERINFO (ID, USERID, REALNAME, GENDER, PHONE, EMAIL, BIRTHDAY, REGISTTIME)
values (151, 150, 'killer', '男', '12345678910', '595565678@qq.com', to_date('12-03-2000', 'dd-mm-yyyy'), to_date('31-08-2016 18:10:32', 'dd-mm-yyyy hh24:mi:ss'));
insert into USERINFO (ID, USERID, REALNAME, GENDER, PHONE, EMAIL, BIRTHDAY, REGISTTIME)
values (154, 153, '黄黄土地', '男', '18522225555', '595565846@qq.com', to_date('09-09-2015', 'dd-mm-yyyy'), to_date('31-08-2016 18:58:40', 'dd-mm-yyyy hh24:mi:ss'));
insert into USERINFO (ID, USERID, REALNAME, GENDER, PHONE, EMAIL, BIRTHDAY, REGISTTIME)
values (161, 160, 'tom', '男', '15012345678', '222222@qq.com', to_date('10-09-2016', 'dd-mm-yyyy'), to_date('31-08-2016 21:58:38', 'dd-mm-yyyy hh24:mi:ss'));
insert into USERINFO (ID, USERID, REALNAME, GENDER, PHONE, EMAIL, BIRTHDAY, REGISTTIME)
values (36, 35, '三百万', '男', '119', 'guddqs5230@qq.com', to_date('14-06-2016', 'dd-mm-yyyy'), to_date('11-08-2016 17:10:05', 'dd-mm-yyyy hh24:mi:ss'));
insert into USERINFO (ID, USERID, REALNAME, GENDER, PHONE, EMAIL, BIRTHDAY, REGISTTIME)
values (165, 164, 'ww', '男', '11212345678', '768446359@qq.com', to_date('04-01-2015', 'dd-mm-yyyy'), to_date('31-08-2016 22:45:47', 'dd-mm-yyyy hh24:mi:ss'));
insert into USERINFO (ID, USERID, REALNAME, GENDER, PHONE, EMAIL, BIRTHDAY, REGISTTIME)
values (95, 94, 'adc', '男', '1125201314', '184824955@qq.com', to_date('01-01-2012', 'dd-mm-yyyy'), to_date('18-08-2016 09:51:49', 'dd-mm-yyyy hh24:mi:ss'));
insert into USERINFO (ID, USERID, REALNAME, GENDER, PHONE, EMAIL, BIRTHDAY, REGISTTIME)
values (98, 97, 'adc', '男', '1101205541', '184824955@qq.com', to_date('01-01-2011', 'dd-mm-yyyy'), to_date('18-08-2016 10:03:30', 'dd-mm-yyyy hh24:mi:ss'));
insert into USERINFO (ID, USERID, REALNAME, GENDER, PHONE, EMAIL, BIRTHDAY, REGISTTIME)
values (100, 99, 'adc', '男', '1101205541', '184824955@qq.com', to_date('01-01-2011', 'dd-mm-yyyy'), to_date('18-08-2016 10:03:52', 'dd-mm-yyyy hh24:mi:ss'));
insert into USERINFO (ID, USERID, REALNAME, GENDER, PHONE, EMAIL, BIRTHDAY, REGISTTIME)
values (104, 103, 'aa', '男', '1101205541', '184824955@qq.com', to_date('14-06-2016', 'dd-mm-yyyy'), to_date('18-08-2016 10:09:50', 'dd-mm-yyyy hh24:mi:ss'));
insert into USERINFO (ID, USERID, REALNAME, GENDER, PHONE, EMAIL, BIRTHDAY, REGISTTIME)
values (106, 105, 'adc', '男', '18670321728', '184824955@qq.com', to_date('01-01-2011', 'dd-mm-yyyy'), to_date('18-08-2016 10:15:32', 'dd-mm-yyyy hh24:mi:ss'));
insert into USERINFO (ID, USERID, REALNAME, GENDER, PHONE, EMAIL, BIRTHDAY, REGISTTIME)
values (108, 107, '3232', '男', '2143243243', 'guddqs5230@qq.com', to_date('01-01-2011', 'dd-mm-yyyy'), to_date('18-08-2016 10:16:31', 'dd-mm-yyyy hh24:mi:ss'));
insert into USERINFO (ID, USERID, REALNAME, GENDER, PHONE, EMAIL, BIRTHDAY, REGISTTIME)
values (81, 80, '老k', '男', '1101205541', '726835795@qq.com', to_date('03-05-1998', 'dd-mm-yyyy'), to_date('17-08-2016 15:49:05', 'dd-mm-yyyy hh24:mi:ss'));
insert into USERINFO (ID, USERID, REALNAME, GENDER, PHONE, EMAIL, BIRTHDAY, REGISTTIME)
values (145, 144, 'xxxx', '男', '13456789699', '876678702@qq.com', to_date('15-09-1994', 'dd-mm-yyyy'), to_date('31-08-2016 17:56:47', 'dd-mm-yyyy hh24:mi:ss'));
insert into USERINFO (ID, USERID, REALNAME, GENDER, PHONE, EMAIL, BIRTHDAY, REGISTTIME)
values (147, 146, '123', '男', '18670321728', '768446359@qq.com', to_date('01-01-2012', 'dd-mm-yyyy'), to_date('31-08-2016 18:03:46', 'dd-mm-yyyy hh24:mi:ss'));
insert into USERINFO (ID, USERID, REALNAME, GENDER, PHONE, EMAIL, BIRTHDAY, REGISTTIME)
values (157, 156, 'ga', '男', '11012345678', '726835795@qq.com', to_date('09-09-1889', 'dd-mm-yyyy'), to_date('31-08-2016 21:08:48', 'dd-mm-yyyy hh24:mi:ss'));
insert into USERINFO (ID, USERID, REALNAME, GENDER, PHONE, EMAIL, BIRTHDAY, REGISTTIME)
values (168, 167, '天天听', '男', '15467645678', '1156897969@qq.com', to_date('02-12-1996', 'dd-mm-yyyy'), to_date('31-08-2016 22:51:05', 'dd-mm-yyyy hh24:mi:ss'));
insert into USERINFO (ID, USERID, REALNAME, GENDER, PHONE, EMAIL, BIRTHDAY, REGISTTIME)
values (102, 101, 'adc', '男', '18670321728', '184824955@qq.com', to_date('01-01-2011', 'dd-mm-yyyy'), to_date('18-08-2016 10:06:24', 'dd-mm-yyyy hh24:mi:ss'));
insert into USERINFO (ID, USERID, REALNAME, GENDER, PHONE, EMAIL, BIRTHDAY, REGISTTIME)
values (163, 162, '孙步文', '男', '14770817212', '1748212046@qq.com', to_date('14-12-1997', 'dd-mm-yyyy'), to_date('31-08-2016 22:29:14', 'dd-mm-yyyy hh24:mi:ss'));
insert into USERINFO (ID, USERID, REALNAME, GENDER, PHONE, EMAIL, BIRTHDAY, REGISTTIME)
values (170, 169, 'wolaile', '男', '13555555555', '2572128872@qq.com', to_date('01-09-2016', 'dd-mm-yyyy'), to_date('01-09-2016 09:16:35', 'dd-mm-yyyy hh24:mi:ss'));
commit;
prompt 22 records loaded
prompt Enabling foreign key constraints for USERADDRESS...
alter table USERADDRESS enable constraint FK_USERADDR_REFERENCE_LOGIN;
prompt Enabling foreign key constraints for ADDRESSDETAIL...
alter table ADDRESSDETAIL enable constraint FK_ADDRESSD_REFERENCE_USERADDR;
prompt Enabling foreign key constraints for ADVICE...
alter table ADVICE enable constraint FK_ADVICE_REFERENCE_LOGIN;
prompt Enabling foreign key constraints for ORDERS...
alter table ORDERS enable constraint FK_ORDERS_REFERENCE_LOGIN;
alter table ORDERS enable constraint FK_ORDERS_REFERENCE_LOGISTIC;
prompt Enabling foreign key constraints for PRODUCTTTYPE...
alter table PRODUCTTTYPE enable constraint FK_PRODUCTT_REFERENCE_PRODUCTT;
prompt Enabling foreign key constraints for PRODUCT...
alter table PRODUCT enable constraint FK_PRODUCT_REFERENCE_PRODUCTT;
prompt Enabling foreign key constraints for AFTERSALE...
alter table AFTERSALE enable constraint FK_AFTERSAL_REFERENCE_LOGISTIC;
alter table AFTERSALE enable constraint FK_AFTERSAL_REFERENCE_ORDERS;
alter table AFTERSALE enable constraint FK_AFTERSAL_REFERENCE_PRODUCT;
prompt Enabling foreign key constraints for CART...
alter table CART enable constraint FK_CART_REFERENCE_LOGIN;
alter table CART enable constraint FK_CART_REFERENCE_PRODUCT;
prompt Enabling foreign key constraints for EVALUATION...
alter table EVALUATION enable constraint FK_EVALUATI_REFERENCE_ORDERS;
prompt Enabling foreign key constraints for HISTORYRECORD...
alter table HISTORYRECORD enable constraint FK_HISTORYR_REFERENCE_PRODUCT;
prompt Enabling foreign key constraints for MESSAGE...
alter table MESSAGE enable constraint FK_MESSAGE_REFERENCE_LOGIN;
prompt Enabling foreign key constraints for ORDERSDETAIL...
alter table ORDERSDETAIL enable constraint FK_ORDERSDE_REFERENCE_ORDERS;
alter table ORDERSDETAIL enable constraint FK_ORDERSDE_REFERENCE_PRODUCT;
prompt Enabling foreign key constraints for PRODUCTPACKAGE...
alter table PRODUCTPACKAGE enable constraint FK_PRODUCTP_REFERENCE_PRODUCT;
prompt Enabling foreign key constraints for PACKAGEDETAIL...
alter table PACKAGEDETAIL enable constraint FK_PACKAGED_REFERENCE_PRODUCTP;
prompt Enabling foreign key constraints for PICPRODUCT...
alter table PICPRODUCT enable constraint FK_PICPRODU_REFERENCE_PRODUCT;
prompt Enabling foreign key constraints for PRODUCTCOLLECTION...
alter table PRODUCTCOLLECTION enable constraint FK_PRODUCTC_REFERENCE_PRODUCT;
prompt Enabling foreign key constraints for USERINFO...
alter table USERINFO enable constraint FK_USERINFO_REFERENCE_LOGIN;
prompt Enabling triggers for LOGIN...
alter table LOGIN enable all triggers;
prompt Enabling triggers for USERADDRESS...
alter table USERADDRESS enable all triggers;
prompt Enabling triggers for ADDRESSDETAIL...
alter table ADDRESSDETAIL enable all triggers;
prompt Enabling triggers for ADVICE...
alter table ADVICE enable all triggers;
prompt Enabling triggers for LOGISTICSINFO...
alter table LOGISTICSINFO enable all triggers;
prompt Enabling triggers for ORDERS...
alter table ORDERS enable all triggers;
prompt Enabling triggers for PRODUCTTTYPE...
alter table PRODUCTTTYPE enable all triggers;
prompt Enabling triggers for PRODUCT...
alter table PRODUCT enable all triggers;
prompt Enabling triggers for AFTERSALE...
alter table AFTERSALE enable all triggers;
prompt Enabling triggers for ANNOUNCEMENT...
alter table ANNOUNCEMENT enable all triggers;
prompt Enabling triggers for CART...
alter table CART enable all triggers;
prompt Enabling triggers for COMPUTERKNOWLEDGE...
alter table COMPUTERKNOWLEDGE enable all triggers;
prompt Enabling triggers for EVALUATION...
alter table EVALUATION enable all triggers;
prompt Enabling triggers for HISTORYRECORD...
alter table HISTORYRECORD enable all triggers;
prompt Enabling triggers for MESSAGE...
alter table MESSAGE enable all triggers;
prompt Enabling triggers for ORDERSDETAIL...
alter table ORDERSDETAIL enable all triggers;
prompt Enabling triggers for PRODUCTPACKAGE...
alter table PRODUCTPACKAGE enable all triggers;
prompt Enabling triggers for PACKAGEDETAIL...
alter table PACKAGEDETAIL enable all triggers;
prompt Enabling triggers for PICPRODUCT...
alter table PICPRODUCT enable all triggers;
prompt Enabling triggers for PRODUCTCOLLECTION...
alter table PRODUCTCOLLECTION enable all triggers;
prompt Enabling triggers for USERINFO...
alter table USERINFO enable all triggers;
set feedback on
set define on
prompt Done.
