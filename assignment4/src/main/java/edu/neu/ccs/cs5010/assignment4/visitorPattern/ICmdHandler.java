package edu.neu.ccs.cs5010.assignment4.visitorPattern;

public interface ICmdHandler {

  boolean isValid();

  String[] getCSVFiles();
}
