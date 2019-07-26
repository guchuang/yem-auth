package com.yem.auth.config.oauth;

/**
 * 〈OAuth2认证服务器〉
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2019年7月23日 上午9:56:06 <br/>
 *
 * @author <a href="mailto:hbszguchuang@163.com">guchuang</a>
 * @version 
 * @since JDK 1.8
 */
//@Configuration
//@EnableResourceServer
//public class SsbResourceServerConfig extends ResourceServerConfigurerAdapter {
//
//
//    @Autowired
//    protected AuthenticationSuccessHandler ssbAuthenticationSuccessHandler;
//
//    @Autowired
//    protected AuthenticationFailureHandler ssbAuthenticationFailureHandler;
//
//  /*  @Autowired
//    private SmsCodeAuthenticationSecurityConfig smsCodeAuthenticationSecurityConfig;*/
//
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        // 所以在我们的app登录的时候我们只要提交的action，不要跳转到登录页
//        http.formLogin()
//                //登录页面，app用不到
//                //.loginPage("/authentication/login")
//                //登录提交action，app会用到
//                // 用户名登录地址
//                .loginProcessingUrl("/form/token")
//                //成功处理器 返回Token
//                .successHandler(ssbAuthenticationSuccessHandler)
//                //失败处理器
//                .failureHandler(ssbAuthenticationFailureHandler);
//
//        http
//                // 手机验证码登录
//                .apply(smsCodeAuthenticationSecurityConfig)
//                .and()
//                .authorizeRequests()
//                //手机验证码登录地址
//                .antMatchers("/mobile/token", "/email/token")
//                .permitAll()
//                .and()
//                .authorizeRequests()
//                .antMatchers(
//                        "/register",
//                        "/social/**",
//                        "/**/*.js",
//                        "/**/*.css",
//                        "/**/*.jpg",
//                        "/**/*.png",
//                        "/**/*.woff2",
//                        "/code/image")
//                .permitAll()//以上的请求都不需要认证
//                .anyRequest()
//                .authenticated()
//                .and()
//                .csrf().disable();
//    }
//
//
//
//}
