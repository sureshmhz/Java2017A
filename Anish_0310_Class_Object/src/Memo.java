/**
 * Created by Anis on 4/2/2015.
 */
public class Memo {
    public static void main(String[] args) {
        SelectMemo select = new SelectMemo();
        //to select the existing memo
        select.memo();

        CreateMemo create= new CreateMemo();
        //to create new memo
        create.memo();

        EditMemo edit= new EditMemo();
        //to edit new memo existing memo
        edit.memo();

        DeleteMemo delete= new DeleteMemo();
        //to delete memo
        delete.memo();

        CopyMemo copy= new CopyMemo();
        //to copy content of  memo
        copy.memo();

        CutMemo cut= new CutMemo();
        //to cut content of memo
        cut.memo();
    }
}
class SelectMemo{
    String memo(){
    /*logic to select memo*/
    }
}

class CreateMemo{
    String memo(){
    /*logic to create memo*/
    }
}

class EditMemo{
    String memo(){
    /*logic to edit memo*/
    }
}

class DeleteMemo{
    String memo(){
    /*logic to delete memo*/
    }
}
class CopyMemo{
    String memo(){
    /*logic to copy memo*/
    }
}
class CutMemo{
    String memo(){
    /*logic to cut memo*/
    }
}

