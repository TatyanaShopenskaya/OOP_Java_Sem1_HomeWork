package GeekBrains.HomeWork_Seminar_3;

public class Group {
    private int groupId;
    private String groupName;


    public Group(int groupId, String groupName) {
        this.groupId = groupId;
        this.groupName = groupName;
    }

    public int getGroupId() {
        return groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public String toString() {
        return "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                '}';
    }


}

