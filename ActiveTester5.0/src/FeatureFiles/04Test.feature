#
#
#
# Copyright 2019 HCL Technologies Limited. All Rights Reserved.
@W.01.01-Login @Module-01.Core @Owner-PrathmeshD
Feature: testid: 01.01.Core - Login

#Positive and negative scenarios for Login
#Covering Login with just user name specified and it will take the password from configuration file
#Covering Login with user name and password both specified
@W.01.01.01-Login
Scenario: Failed Login with User name (and wrong password in configuration file)
	Given	"STEP:LOGIN-01-01"	Login as "test9"
	Then	"STEP:LOGIN-01-02"	Verify login error: the user ID or the password is invalid

@W.01.01.02-Login
Scenario: Failed Login with non existing User name (will take password from configuration file)
	Given	"STEP:LOGIN-02-01"	Login as "test 10"
	Then	"STEP:LOGIN-02-02"	Verify login error: the user ID or the password is invalid
