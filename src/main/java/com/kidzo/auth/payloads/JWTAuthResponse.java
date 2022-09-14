package com.kidzo.auth.payloads;

public class JWTAuthResponse {
    private String accessToken;
    private String tokenType = "Bearer";
    private String user_id;

    public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public JWTAuthResponse(String accessToken) {
        this.accessToken = accessToken;
    }
    public JWTAuthResponse(String accessToken, String user_id) {
        this.accessToken = accessToken;
        this.user_id = user_id;
    }
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }
}
