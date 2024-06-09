package org.example;

import org.example.entity.Line;
import org.example.entity.Points;
import org.example.constant.Size;
import org.example.entity.Square;
import org.example.entity.Triangle;
import org.example.view.InputView;
import org.example.view.ResultView;

import java.io.IOException;

public class Main {

    private static final InputView inputView = new InputView();
    private static final ResultView resultView = new ResultView();

    public static void main(String[] args) throws IOException {
        while(true){
            inputView.displayCoordinatePrompt();
            String[] userAnswer = inputView.inputCoordinates();
            Points points = inputView.strToPoints(userAnswer);
            System.out.println(Size.Line);
            if(points.getPointsSize() == Size.Line.getSize()){
                // NOTE: 라인
                Line line = new Line(points);
                if(line.isPossible(points, Size.Line.getSize())){
                    resultView.displayCalculationResult(line.Calculator());
                    if(!inputView.askToContinueGame()){
                        break;
                    }
                }else{
                    resultView.displayInputFormatErrMsg();
                }
            }else if(points.getPointsSize() == Size.TRIANGLE.getSize()){
                // NOTE: 삼각형
                Triangle triangle = new Triangle(points);
                if(triangle.isPossible(points, Size.TRIANGLE.getSize())){
                    resultView.displayCalculationResult(triangle.Calculator());
                    if(!inputView.askToContinueGame()){
                        break;
                    }
                }else{
                    resultView.displayInputFormatErrMsg();
                }
            }else if(points.getPointsSize() == Size.SQUARE.getSize()){
                // NOTE: 사각형
                Square square = new Square(points);
                if(square.isPossible(points, Size.SQUARE.getSize())){
                    resultView.displayCalculationResult(square.Calculator());
                    if(!inputView.askToContinueGame()){
                        break;
                    }
                }else{
                    resultView.displayInputFormatErrMsg();
                }
            }
        }
    }


}