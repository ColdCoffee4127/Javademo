package com.coffee.use;

import com.coffee.service.BibsService;
import com.coffee.service.impl.BibsServiceImpl;

import java.util.List;

/**
 * @ClassName Querytrans
 * @description:
 * @author: coldcoffee
 * @create: 2024-06-28 14:50
 * @Version 1.0
 **/
public class Querytrans {
    public List<String> queryTrans(){
        BibsServiceImpl bibsService = new BibsServiceImpl();
        if(bibsService.Querytrans() == null){
            return null;
        }else{
            return bibsService.Querytrans();
        }
    }
}
