package org.mybatis.jpetstore.service;


public interface IAccount {
    public String getUsername();

    public void setUsername(String username);

    public String getPassword();

    public void setPassword(String password);

    public String getEmail();

    public void setEmail(String email);

    public String getFirstName();

    public void setFirstName(String firstName);

    public String getLastName();

    public void setLastName(String lastName);

    public String getStatus();

    public void setStatus(String status);

    public String getAddress1();

    public void setAddress1(String address1);

    public String getAddress2();

    public void setAddress2(String address2);

    public String getCity();

    public void setCity(String city);

    public String getState();

    public void setState(String state);

    public String getZip();

    public void setZip(String zip);

    public String getCountry();

    public void setCountry(String country);

    public String getPhone();

    public void setPhone(String phone);

    public String getFavouriteCategoryId();

    public void setFavouriteCategoryId(String favouriteCategoryId);

    public String getLanguagePreference();

    public void setLanguagePreference(String languagePreference);

    public boolean isListOption();

    public void setListOption(boolean listOption);

    public boolean isBannerOption();

    public void setBannerOption(boolean bannerOption);

    public String getBannerName();

    public void setBannerName(String bannerName);
}

