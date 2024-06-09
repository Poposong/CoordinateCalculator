package org.example.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ResultView {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void displayInputFormatErrMsg(){
        System.out.println("형식에 맞춰서 입력해주세요.");
    }

    public void displayCalculationResult(double result){
        System.out.println("결과: "+result);
    }



}
