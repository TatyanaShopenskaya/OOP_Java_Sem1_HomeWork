package GeekBrains.UnitTests.Lection1;
import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static java.lang.AssertionError.*;

import java.util.concurrent.Callable;

public class CalculatorTest {
    public static void main(String[] args) {
//        if(4!=Calculator.calculation(2,2,'+')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//        if(2!=Calculator.calculation(4,2,'-')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//        if(2!=Calculator.calculation(4,2,'/')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//        if(6!=Calculator.calculation(3,2,'*')){
//            throw new AssertionError("Ошибка в методе");
//    }

//        assert 4 == Calculator.calculation(2, 2, '+');
//        assert 2 == Calculator.calculation(4, 2, '-');
//        assert 2 == Calculator.calculation(4, 2, '/');
//        assert 9 == Calculator.calculation(3, 2, '*');    //здесь должно появится сообщение об ошибке!

        assertThat(Calculator.calculation(2, 2, '+')).isEqualTo(4);  //"утверждаю, что 2+2=4, в ином случае надо выбросить исключение"
        assertThat(Calculator.calculation(4, 2, '-')).isEqualTo(2);
        assertThat(Calculator.calculation(4, 2, '/')).isEqualTo(2);
        assertThat(Calculator.calculation(3, 2, '*')).isEqualTo(6);


        //assertThatThrownBy(()->Calculator.calculation(8,4,'_')).isInstanceOf(IllegalStateException.class);  //ошибки для ожидаемых исключений -
// ПОЧЕМУ ВЫДАЕТ ОШИБКУ???

//        try {
//            Calculator.calculation(8,2,'_');
//                }catch (IllegalStateException e){
//            if (!e.getMessage().equals("Unexpected value operator: _")){
//                throw new AssertionError("Ошибка в методе");
//            }
//            }
    }
}
