package com.login.oauthAndJwt.auth.oauth.info;

import java.util.Map;

public class NaverUserInfo implements OAuth2UserInfo{

    private Map<String, Object> attributes;

    public NaverUserInfo(Map<String, Object> attributes) {
        this.attributes = (Map<String, Object>) attributes.get("response");
    }

    @Override
    public String getProviderId() {
        return (String) attributes.get("id");
    }

//    @Override
//    public String getEmail() {
//        return (String) attributes.get("email");
//    }

    @Override
    public String getName() {
        return (String) attributes.get("name");
    }
}
