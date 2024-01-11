package Prototype_Pattern;

public class Presentation extends DocumentCreator {
    private int slidecount;
    public Presentation(String content,int slideCount){
        super("Presentation",content);
        this.slidecount = slideCount;
    }
    public int getSlideCount(){
        return slidecount;
    }
    public void setSlideCount(int slidecount){
        this.slidecount = slidecount;
    }

    @Override
    public Presentation clone(){
        return new Presentation(getContent(),getSlideCount());
    }
}
