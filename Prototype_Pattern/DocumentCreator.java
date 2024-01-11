package Prototype_Pattern;
import java.util.*;

abstract class DocumentCreator implements Cloneable{

    public String type;
    public String content;

    public DocumentCreator(String type, String content){
        this.type = type;
        this.content = content;
    }
    public abstract DocumentCreator clone();

    public String getType(){
        return type;
    }
    public String getContent(){
        return content;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setContent(String content){
        this.content = content;
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof DocumentCreator)) return false;
        DocumentCreator doc = (DocumentCreator)o;
        return Objects.equals(type, doc.type) && Objects.equals(content, doc.content);
    }

    @Override
    public int hashCode(){
        return Objects.hash(type, content);
    }
}
