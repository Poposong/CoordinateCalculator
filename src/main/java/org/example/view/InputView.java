package org.example.view;

import org.example.entity.Point;
import org.example.entity.Points;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void displayCoordinatePrompt(){
        System.out.println("좌표를 입력하세요.");
    }

    public Points userInput() throws Exception {
        String[] userAnswer = inputCoordinates();
        return strToPoints(userAnswer);
    }

    public String[] inputCoordinates() throws IOException {
        return br.readLine().split("-");
    }

    public Points strToPoints(String[] userAnswer){
        Points points = new Points();
        for(String input : userAnswer){
            input = input.replace("(", "").replace(")","");
            String[] dot = input.split(",");

            if(dot.length == 2){ // 두 개의 좌표를 받은 경우
                points.addPoint(new Point(Integer.parseInt(dot[0]), Integer.parseInt(dot[1])));
            }else{
                return null;
            }
        }
        return points;
    }

    public boolean askToContinueGame() throws IOException {
        System.out.println("계속 게임을 진행하시겠어요?(Y/N)");
        while(true){
            String answer = br.readLine();
            if("Y".equals(answer)){
                return true;
            }else if("N".equals(answer)){
                return false;
            }else{
                System.out.println("Y 또는 N으로 대답해주세요.");
            }
        }
    }




}
