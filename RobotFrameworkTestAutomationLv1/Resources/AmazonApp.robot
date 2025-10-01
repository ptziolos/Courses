*** Settings ***
Documentation   This is some basic info about the whole suite
Resource        PO/LandingPage.robot
Resource        PO/TopNav.robot
Resource        PO/Product.robot
Resource        PO/List.robot


*** Keywords ***
Search for Products
    LandingPage.Load
    LandingPage.Verify Page Loaded
    TopNav.Search Product

Select Product from Search Results
    Product.Select Product

Add Product to list
    List.Add To List
    List.Verify Addition To List



