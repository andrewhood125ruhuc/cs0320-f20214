package cn.dev33.satoken.sso.exception;

/**
 * 定义所有 SSO 异常细分状态码 
 * 
 * @author kong
 * @date: 2022-4-25
 */
public class SaSsoExceptionCode {

	/** redirect 重定向 url 是一个无效地址 */
	public static final int CODE_20001 = 20001;

	/** redirect 重定向 url 不在 allowUrl 允许的范围内 */
	public static final int CODE_20002 = 20002;

	/** 接口调用方提供的 secretkey 秘钥无效 */
	public static final int CODE_20003 = 20003;

	/** 提供的 ticket 是无效的 */
	public static final int CODE_20004 = 20004;

	/** 在模式三下，sso-client 调用 sso-server 端 校验ticket接口 时，得到的响应是校验失败 */
	public static final int CODE_20005 = 20005;

	/** 在模式三下，sso-client 调用 sso-server 端 单点注销接口 时，得到的响应是注销失败 */
	public static final int CODE_20006 = 20006;
	
}
