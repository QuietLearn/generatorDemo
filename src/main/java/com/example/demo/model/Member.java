package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

public class Member implements Serializable {
    private Integer id;

    private String username;

    private String nickname;

    private String password;

    private String md5Password;

    private Integer gender;

    private String mobile;

    private String qq;

    private String weixin;

    private String email;

    private Integer memberTypeId;

    private String memberTypeName;

    private Integer vipLevel;

    private Date buyTime;

    private Date endTime;

    private Integer aging;

    private Date birthday;

    private Integer points;

    private Date lastLogin;

    private String lastLoginip;

    private Date registerTime;

    private String registerIp;

    private String uuidToken;

    private Integer totalMoney;

    private Integer isLock;

    private Integer isDel;

    private Date gmtCreated;

    private Date gmtModified;

    private String picAddress;

    private String favoritesIds;

    private static final long serialVersionUID = 1L;

    public Member(Integer id, String username, String nickname, String password, String md5Password, Integer gender, String mobile, String qq, String weixin, String email, Integer memberTypeId, String memberTypeName, Integer vipLevel, Date buyTime, Date endTime, Integer aging, Date birthday, Integer points, Date lastLogin, String lastLoginip, Date registerTime, String registerIp, String uuidToken, Integer totalMoney, Integer isLock, Integer isDel, Date gmtCreated, Date gmtModified, String picAddress, String favoritesIds) {
        this.id = id;
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        this.md5Password = md5Password;
        this.gender = gender;
        this.mobile = mobile;
        this.qq = qq;
        this.weixin = weixin;
        this.email = email;
        this.memberTypeId = memberTypeId;
        this.memberTypeName = memberTypeName;
        this.vipLevel = vipLevel;
        this.buyTime = buyTime;
        this.endTime = endTime;
        this.aging = aging;
        this.birthday = birthday;
        this.points = points;
        this.lastLogin = lastLogin;
        this.lastLoginip = lastLoginip;
        this.registerTime = registerTime;
        this.registerIp = registerIp;
        this.uuidToken = uuidToken;
        this.totalMoney = totalMoney;
        this.isLock = isLock;
        this.isDel = isDel;
        this.gmtCreated = gmtCreated;
        this.gmtModified = gmtModified;
        this.picAddress = picAddress;
        this.favoritesIds = favoritesIds;
    }

    public Member() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getMd5Password() {
        return md5Password;
    }

    public void setMd5Password(String md5Password) {
        this.md5Password = md5Password == null ? null : md5Password.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getMemberTypeId() {
        return memberTypeId;
    }

    public void setMemberTypeId(Integer memberTypeId) {
        this.memberTypeId = memberTypeId;
    }

    public String getMemberTypeName() {
        return memberTypeName;
    }

    public void setMemberTypeName(String memberTypeName) {
        this.memberTypeName = memberTypeName == null ? null : memberTypeName.trim();
    }

    public Integer getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(Integer vipLevel) {
        this.vipLevel = vipLevel;
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getAging() {
        return aging;
    }

    public void setAging(Integer aging) {
        this.aging = aging;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getLastLoginip() {
        return lastLoginip;
    }

    public void setLastLoginip(String lastLoginip) {
        this.lastLoginip = lastLoginip == null ? null : lastLoginip.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp == null ? null : registerIp.trim();
    }

    public String getUuidToken() {
        return uuidToken;
    }

    public void setUuidToken(String uuidToken) {
        this.uuidToken = uuidToken == null ? null : uuidToken.trim();
    }

    public Integer getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Integer totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Integer getIsLock() {
        return isLock;
    }

    public void setIsLock(Integer isLock) {
        this.isLock = isLock;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Date getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getPicAddress() {
        return picAddress;
    }

    public void setPicAddress(String picAddress) {
        this.picAddress = picAddress == null ? null : picAddress.trim();
    }

    public String getFavoritesIds() {
        return favoritesIds;
    }

    public void setFavoritesIds(String favoritesIds) {
        this.favoritesIds = favoritesIds == null ? null : favoritesIds.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", nickname=").append(nickname);
        sb.append(", password=").append(password);
        sb.append(", md5Password=").append(md5Password);
        sb.append(", gender=").append(gender);
        sb.append(", mobile=").append(mobile);
        sb.append(", qq=").append(qq);
        sb.append(", weixin=").append(weixin);
        sb.append(", email=").append(email);
        sb.append(", memberTypeId=").append(memberTypeId);
        sb.append(", memberTypeName=").append(memberTypeName);
        sb.append(", vipLevel=").append(vipLevel);
        sb.append(", buyTime=").append(buyTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", aging=").append(aging);
        sb.append(", birthday=").append(birthday);
        sb.append(", points=").append(points);
        sb.append(", lastLogin=").append(lastLogin);
        sb.append(", lastLoginip=").append(lastLoginip);
        sb.append(", registerTime=").append(registerTime);
        sb.append(", registerIp=").append(registerIp);
        sb.append(", uuidToken=").append(uuidToken);
        sb.append(", totalMoney=").append(totalMoney);
        sb.append(", isLock=").append(isLock);
        sb.append(", isDel=").append(isDel);
        sb.append(", gmtCreated=").append(gmtCreated);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", picAddress=").append(picAddress);
        sb.append(", favoritesIds=").append(favoritesIds);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}