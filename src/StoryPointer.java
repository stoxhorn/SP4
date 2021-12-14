

// Rules for reading storypointer:
// 0x = new storypointer
// the Name for the storypointer/ID is in the same line as 0x, the line afterwards, and until x0 is the string

public class StoryPointer {

    String ID;
    String StoryString;

    @Override
    public String toString() {
        return  StoryString;
    }

    public StoryPointer (String newID, String StoryString) {
        this.ID = newID;
        this.StoryString = StoryString;
    }

    public String getID(){
        return this.ID;
    }

    public String getStoryString(){
        return this.StoryString;
    }

}
