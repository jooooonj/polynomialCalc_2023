package com.ll;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CalcTests {
    @Test
    @DisplayName("1 + 1 == 2")
    void t1(){
        assertThat(Calc.run("1 + 1")).isEqualTo(2);
    }

    @Test
    @DisplayName("2 + 1 == 3")
    void t2(){
        assertThat(Calc.run("2 + 1")).isEqualTo(3);
    }

    @Test
    @DisplayName("2 + 2 == 4")
    void t3(){
        assertThat(Calc.run("2 + 2")).isEqualTo(4);
    }

    @Test
    @DisplayName("1112 + 2222 == 3334")
    void t4(){
        assertThat(Calc.run("1112 + 2222")).isEqualTo(3334);
    }

    @Test
    @DisplayName("50 - 30 == 20")
    void t5(){
        assertThat(Calc.run("50 - 30")).isEqualTo(20);
    }

    @Test
    @DisplayName("100 - 106 == -6")
    void t6(){
        assertThat(Calc.run("100 - 106")).isEqualTo(-6);
    }

    @Test
    @DisplayName("10 + 20 + 30 == 60")
    void t7() {
        assertThat(Calc.run("10 + 20 + 30")).isEqualTo(60);
    }

    @Test
    @DisplayName("10 - 20 + 30 == 20")
    void t8() {
        assertThat(Calc.run("10 - 20 + 30")).isEqualTo(20);
    }

    @Test
    @DisplayName("10 * 20 == 200")
    void t9() {
        assertThat(Calc.run("10 * 20")).isEqualTo(200);
    }

    @Test
    @DisplayName("10 * 20 * 10 == 2000")
    void t10() {
        assertThat(Calc.run("10 * 20 * 10")).isEqualTo(2000);
    }
    @Test
    @DisplayName("10 * 20 + 11 == 210")
    void t11() {
        assertThat(Calc.run("10 * 20 + 10")).isEqualTo(210);
    }
    @Test
    @DisplayName("10 + 20 * 3 == 70")
    void t12() {
        assertThat(Calc.run("10 + 20 * 3")).isEqualTo(70);
    }
    @Test
    @DisplayName("10 + 20 + 30 * 3 == 120")
    void t13() {
        assertThat(Calc.run("10 + 20 + 30 * 3")).isEqualTo(120);
    }

    @Test
    @DisplayName("5 * 2 + 3 * 3 == 19")
    void t14() {
        assertThat(Calc.run("5 * 2 + 3 * 3")).isEqualTo(19);
    }
    @Test
    @DisplayName("5 * 2 - 3 * 3 == 1")
    void t15() {
        assertThat(Calc.run("5 * 2 - 3 * 3")).isEqualTo(1);
    }

}
