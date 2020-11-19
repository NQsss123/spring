package com.tfswx.service.ServiceImpl;

import com.tfswx.service.MutService;
import org.springframework.stereotype.Service;

@Service
public class MutServiceImpl implements MutService {
    @Override
    public int Mut() {
        int a;
        int b;
        int c;
        int d;
        for(a=1;a<10;a++){
            for(b=1;b<=a;b++){
                System.out.print(a+"*"+b+"="+a*b+"\t");
            }
            System.out.println();
        }


        return 1;
    }
}
