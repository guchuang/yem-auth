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
/*@Configuration
@EnableAuthorizationServer
public class SsbAuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    public SsbAuthorizationServerConfig(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.userDetailsService(userDetailsService);
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()//配置内存中，也可以是数据库
                .withClient("awbeci")//clientid
                .secret("awbeci-secret")
                .accessTokenValiditySeconds(3600)//token有效时间  秒
                .authorizedGrantTypes("refresh_token", "password", "authorization_code")//token模式
                .scopes("all")//限制允许的权限配置

                .and()//下面配置第二个应用   （不知道动态的是怎么配置的，那就不能使用内存模式，应该使用数据库模式来吧）
                .withClient("test")
                .scopes("testSc")
                .accessTokenValiditySeconds(7200)
                .scopes("all");
    }


}*/
