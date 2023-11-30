package api;

import com.lei.sulotion.XiaoEr;
import com.lei.sulotion.cook.impl.GuangDongCook;
import com.lei.sulotion.cook.impl.JiangSuCook;
import com.lei.sulotion.cook.impl.ShanDongCook;
import com.lei.sulotion.cook.impl.SiChuanCook;
import com.lei.sulotion.cuisine.impl.GuangDongCuisine;
import com.lei.sulotion.cuisine.impl.JiangSuCuisine;
import com.lei.sulotion.cuisine.impl.ShanDongCuisine;
import com.lei.sulotion.cuisine.impl.SiChuanCuisine;
import org.junit.Test;

/**
 * test
 *
 * @author leijiahao
 * @date 2023-11-30
 */
public class ApiTest {
    @Test
    public void test() {
        GuangDongCuisine guangDongCuisine = new GuangDongCuisine(new GuangDongCook());
        JiangSuCuisine jiangSuCuisine = new JiangSuCuisine(new JiangSuCook());
        ShanDongCuisine shanDongCuisine = new ShanDongCuisine(new ShanDongCook());
        SiChuanCuisine siChuanCuisine = new SiChuanCuisine(new SiChuanCook());
        //点单
        XiaoEr xiaoEr = new XiaoEr();
        xiaoEr.order(guangDongCuisine);
        xiaoEr.order(jiangSuCuisine);
        xiaoEr.order(shanDongCuisine);
        xiaoEr.order(siChuanCuisine);
        // 下单
        xiaoEr.placeOrder();
    }
}
