package State_Design_Pattern.PrimitiveVersion;

interface DocumentState{
    void publish(Document document);
}

class DraftState implements DocumentState {
    @Override
    public void publish(Document document){
        System.out.println("In the Drafting state");
        document.setState(new ModerationState());

    }
}

class ModerationState implements DocumentState {

    @Override
    public void publish(Document document) {
        System.out.println("In the Moderation state");
        document.setState(new PublishedState());
    }
}

class PublishedState implements DocumentState {
    @Override
    public void publish(Document document) {
        System.out.println("The Document has been published");

    }
}
public class Document {
    private DocumentState state;

    public Document(){
        this.state = new DraftState();
    }

    public void publish(){
        state.publish(this); //passing the current state here, using the "this" keyword, which helps
        // in passing control through the different states in the system
    }
    public void setState(DocumentState state){
        this.state = state;
    }

    public static void main(String[] args) {
        Document d1 = new Document();

        System.out.println("Transitioning from Draft state to Moderation state");
        d1.publish();

        System.out.println("Transitioning from the Moderation state to the Published state");
        d1.publish();



        System.out.println("Publishing the doc");
        d1.publish();

        System.out.println("Manually readjusting the state");
        d1.setState(new ModerationState());

        //publishing the doc
        d1.publish();

    }

}
