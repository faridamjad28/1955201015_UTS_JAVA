/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class UtsJava {

   
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("|  PROGRAM MENENTUKAN SHIO  |");
    System.out.println("        APA SHIO KAMU ???        ");
    System.out.println("Masukan Tahun Kelahiran Kamu Dari Tahun 1900 s/d 2031 ");
    System.out.println("Tahun Kelahiran Kamu : ");
    int tahun = Integer.parseInt(input.readLine());
   
    if ((tahun==1900 || (tahun==1912) || tahun==1924 || tahun==1936 || tahun==1948
            || tahun==1960 || tahun==1972 || tahun==1984 || tahun==1996 || tahun==2008 || tahun==2020))
    {
       System.out.println("SHIO Kamu Adalah TIKUS");
    }
    else if ((tahun==1901 || tahun==1913 || tahun==1925 || tahun==1937 || tahun==1949
            || tahun==1961 || tahun==1973 || tahun==1985 || tahun==1997 || tahun==2009 || tahun==2021))
    {
        System.out.println("SHIO Kamu Adalah KERBAU");
    }
    else if ((tahun==1902 || tahun==1914 || tahun==1926 || tahun==1938 || tahun==1950
            || tahun==1962 || tahun==1974 || tahun==1986 || tahun==1998 || tahun==2010 || tahun==2022))
    {
        System.out.println("SHIO Kamu Adalah MACAN");
    }
    else if ((tahun==1903 || tahun==1915 || tahun==1927 || tahun==1939 || tahun==1951
            || tahun==1963 || tahun==1975 || tahun==1987 || tahun==1999 || tahun==2011 || tahun==2023))
    {
        System.out.println("SHIO Kamu Adalah KELINCI");
    }
    else if ((tahun==1904 || tahun==1916 || tahun==1928 || tahun==1940 || tahun==1952
            || tahun==1964 || tahun==1976 || tahun==1988 || tahun==2000 || tahun==2012 || tahun==2024))
    {
        System.out.println("SHIO Kamu Adalah NAGA");
    }
    else if ((tahun==1905 || tahun==1917 || tahun==1929 || tahun==1941 || tahun==1953
            || tahun==1965 || tahun==1977 || tahun==1989 || tahun==2001 || tahun==2013 || tahun==2025))
    {
        System.out.println("SHIO Kamu Adalah ULAR");
    }
    else if ((tahun==1906 || tahun==1918 || tahun==1930 || tahun==1942 || tahun==1954
            || tahun==1966 || tahun==1978 || tahun==1990 || tahun==2002 || tahun==2014 || tahun==2026))
    {
        System.out.println("SHIO Kamu Adalah KUDA");
    }
    else if ((tahun==1907 || tahun==1919 || tahun==1931 || tahun==1943 || tahun==1955
            || tahun==1967 || tahun==1979 || tahun==1991 || tahun==2003 || tahun==2015 || tahun==2027))
    {
        System.out.println("SHIO Kamu Adalah KAMBING");
    }
    else if ((tahun==1908 || tahun==1920 || tahun==1932 || tahun==1944 || tahun==1956
            || tahun==1968 || tahun==1980 || tahun==1992 || tahun==2004 || tahun==2016 || tahun==2028))
    {
        System.out.println("SHIO Kamu Adalah MONYET");
    }
    else if ((tahun==1909 || tahun==1921 || tahun==1933 || tahun==1945 || tahun==1957
            && tahun==1969 || tahun==1981 || tahun==1993 || tahun==2005 || tahun==2017 || tahun==2029))
    {
        System.out.println("SHIO Kamu Adalah AYAM");
    }
    else if ((tahun==1910 || tahun==1922 || tahun==1934 || tahun==1946 || tahun==1958
            && tahun==1970 || tahun==1982 || tahun==1994 || tahun==2006 || tahun==2018 || tahun==2030))
    {
        System.out.println("SHIO Kamu Adalah ANJING");
    }
    else if ((tahun==1911 || tahun==1923 || tahun==1935 || tahun==1947 || tahun==1959
            && tahun==1971 || tahun==1983 || tahun==1995 || tahun==2007 || tahun==2019 || tahun==2031))
    {
        System.out.println("SHIO Kamu Adalah BABI");
    }
    else
    {
        System.out.println("Maaf, Angka yang Kamu Masukan Salah!");
    }
    }
    
}
