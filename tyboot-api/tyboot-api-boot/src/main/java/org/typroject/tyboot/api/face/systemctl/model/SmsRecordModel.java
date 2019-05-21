
package org.typroject.tyboot.api.face.systemctl.model;

import org.typroject.tyboot.core.rdbms.model.BaseModel;

import java.util.Date;

/**
 * <p>
 * 验证码发送记录 model
 * </p>
 *
 * @author 子杨
 * @since 2017-09-09
 */
public class SmsRecordModel extends BaseModel {

    private static final long serialVersionUID = 1L;

    /**
     * 短信编号（可以自己生成，也可以第三方复返回，或者模板编号）
     */
    private String smsCode;
    /**
     * 电话号码
     */
    private String mobile;
    /**
     * 短信类型;登录验证码短信，修改密码的短信
     */
    private String smsType;
    private String smsParams;
    private String smsContent;
    /**
     * 发送时间
     */
    private Date sendTime;


    private String verificationCode;

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public String getSmsParams() {
        return smsParams;
    }

    public void setSmsParams(String smsParams) {
        this.smsParams = smsParams;
    }

    public String getSmsContent() {
        return smsContent;
    }

    public void setSmsContent(String smsContent) {
        this.smsContent = smsContent;
    }

    public String getSmsCode() {
        return smsCode;
    }

    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSmsType() {
        return smsType;
    }

    public void setSmsType(String smsType) {
        this.smsType = smsType;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

}
