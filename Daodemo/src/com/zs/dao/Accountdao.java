package com.zs.dao;

import java.sql.Connection;

public interface Accountdao {
    int addMoney(String to, int money, Connection con);
    int subMoneys(String from,int money,Connection con);
}
