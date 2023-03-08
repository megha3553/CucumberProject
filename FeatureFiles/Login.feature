Feature: Login

Scenario Outline: Successfully login with valid Credential

Given User open Chrome Browser
When User Enter Valid URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
Then User Enter Valid User Name "<email>"
And User Enter Valid Password "<password>"
Then User click on login button
When Validate Page Title "Dashboard / nopCommerce administration"
Then User Close Chrome Browser


Examples:

|email												|		password				|
|admin@yourstore.com					|admin							|
|megha@3553@gmail.com					|megha3553					|
