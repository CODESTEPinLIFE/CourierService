package ru.TryastsinStepan.homework.writer;

import ru.TryastsinStepan.homework.purpose.Purpose;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PurposeWriter {
    public static void write(File file, Purpose [] purposes) throws IOException{
       try(FileWriter fileWriter = new FileWriter(file)){
           fileWriter.write(purposes.length + "\n");
           for(Purpose purpose : purposes){
               fileWriter.write(purpose.getOrder().getNumberOrder() +", "+
                       purpose.getStartPoint().getX() + ", " + purpose.getStartPoint().getY()+", "+ purpose.getTimeMoment().getStartInterval()+
                       ", "+  purpose.getTimeMoment().getFinishInterval() + ", "+ purpose.getRouteLength()+"\n ");
           }
           fileWriter.close();
       }catch(IOException e){
           e.printStackTrace();;
       }
    }
}
