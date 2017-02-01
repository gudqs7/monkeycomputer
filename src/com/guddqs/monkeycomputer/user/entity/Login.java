package com.guddqs.monkeycomputer.user.entity;

public class Login {
    @Override
	public String toString() {
		return "Login [loginid=" + loginid + ", loginname=" + loginname + ", loginpwd=" + loginpwd + ", isadmin="
				+ isadmin + ", state=" + state + "]";
	}

	private Integer loginid;

    private String loginname;

    private String loginpwd;

    private Short isadmin;

    private Integer state;

    public Integer getLoginid() {
        return loginid;
    }

    public void setLoginid(Integer loginid) {
        this.loginid = loginid;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getLoginpwd() {
        return loginpwd;
    }

    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd == null ? null : loginpwd.trim();
    }

    public Short getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(Short isadmin) {
        this.isadmin = isadmin;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}