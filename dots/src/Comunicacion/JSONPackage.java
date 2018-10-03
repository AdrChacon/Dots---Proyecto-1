package Comunicacion;
import java.util.ArrayList;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.annotation.*;
import java.io.File;
import java.io.*;
/**
 * @author AdrChacon
 */
public class JSONPackage {

    public int getStartDotX() {
        return startDotX;
    }

    public void setStartDotX(int startDotX) {
        this.startDotX = startDotX;
    }

    public int getStartDotY() {
        return startDotY;
    }

    public void setStartDotY(int startDotY) {
        this.startDotY = startDotY;
    }

    public int getEndDotX() {
        return endDotX;
    }

    public void setEndDotX(int endDotX) {
        this.endDotX = endDotX;
    }

    public int getEndDotY() {
        return endDotY;
    }

    public void setEndDotY(int endDotY) {
        this.endDotY = endDotY;
    }

    public int getFigureNodes() {
        return figureNodes;
    }

    public void setFigureNodes(int figureNodes) {
        this.figureNodes = figureNodes;
    }

    public ArrayList getFigureXs() {
        return figureXs;
    }

    public void setFigureXs(ArrayList figureXs) {
        this.figureXs = figureXs;
    }

    public ArrayList getFigureYs() {
        return figureYs;
    }

    public void setFigureYs(ArrayList figureYs) {
        this.figureYs = figureYs;
    }

    public int getScoreValue() {
        return ScoreValue;
    }

    public void setScoreValue(int ScoreValue) {
        this.ScoreValue = ScoreValue;
    }
    private int startDotX;
    private int startDotY;
    private int endDotX;
    private int endDotY;
    private int figureNodes;
    private ArrayList figureXs;
    private ArrayList figureYs;
    private int ScoreValue;
    
    public JSONPackage(int X1, int Y1, int X2, int Y2){
        startDotX = X1;
        startDotY = Y1;
        endDotX = X2;
        endDotY = Y2;
    }
    public JSONPackage(int X1, int Y1, int X2, int Y2, int Score, ArrayList Xs, ArrayList Ys, int nodes){
        startDotX = X1;
        startDotY = Y1;
        endDotX = X2;
        endDotY = Y2;
        ScoreValue = Score;
        figureXs = Xs;
        figureYs = Ys;
        figureNodes = nodes;
    }
}
