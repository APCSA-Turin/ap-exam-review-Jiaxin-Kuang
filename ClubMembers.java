import java.util.ArrayList;

public class ClubMembers {
    private ArrayList<MemberInfo> memberList;

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public ClubMembers() {
        memberList = new ArrayList<MemberInfo>();
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public ArrayList<MemberInfo> getMemberList() {
        return memberList;
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public void setMemberList(ArrayList<MemberInfo> newList) {
        memberList = newList;
    }

    public void addMembers(String[] names, int gradYear) {
	for(int i = 0; i < names.length; i ++){
		MemberInfo newMember = new MemberInfo(names[i], gradYear, true);
		memberList.add(newMember);
	}
    }

    public ArrayList<MemberInfo> removeMembers(int year){
	ArrayList<MemberInfo> goodStanding = new ArrayList<>();
    for(int i = 0; i < memberList.size(); i ++){
	    if(memberList.get(i).getGradYear() <= year){
		    if(memberList.get(i).inGoodStanding()){
			    goodStanding.add(memberList.get(i));
		    }
		    memberList.remove(i);
		    i --; 
	    }
    }
    return goodStanding;
    }
}

