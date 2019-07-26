package com.yem.auth.config.security;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *〈自定义无加密密码验证〉
 * 重写了PasswordEncoder  密码是不加密的
 * 加密的话 使用 BCryptPasswordEncoder
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2019年7月23日 上午9:58:04 <br/>
 *
 * @author <a href="mailto:hbszguchuang@163.com">guchuang</a>
 * @version 
 * @since JDK 1.8
 */
public class NoEncryptPasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(CharSequence charSequence) {
        return (String) charSequence;
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        //密码对比 密码对 true 反之 false
        //CharSequence 数据库中的密码
        //s 前台传入的密码
        return s.equals((String) charSequence);
    }
}
