package com.codestates.coffee;

import com.codestates.member.entity.Member;
import com.fasterxml.jackson.databind.cfg.ConfigFeature;
import org.springframework.stereotype.Service;

import java.util.List;


//빈 등록 용 서비스에노테이션
@Service
    public class    CoffeeService {

    //여기서 Cofee는 Entity

        public Coffee createCoffee (Coffee coffee) {

            return  coffee;


        }

        public  Coffee UpdateCoffee(Coffee coffee){
            Coffee UpdateCoffee = coffee;
            return  UpdateCoffee;


        }

        public  Coffee findCoffee (long coffeeId){
              Coffee coffee =
                      new Coffee(coffeeId ,"아메리카노", "Americano",2500 );
                return  coffee;
        }

        public List<Coffee> findCoffees(){
            return  List.of(
                    new Coffee(1 , "아메리카노" ,"Americano", 2500 ),
                    new Coffee(2, "캐러멜 라떼" ,"Caramel Latte" , 5000));


//         List<Coffee> coffees = List.of(
//            new Coffee(1 , "아메리카노" ,"Americano", 2500 ),
//            new Coffee(2, "캐러멜 라떼" ,"Caramel Latte" , 5000));
//            return  coffees;


        }

        public  void  deleteCoffee(long coffeeId){

        }
}



