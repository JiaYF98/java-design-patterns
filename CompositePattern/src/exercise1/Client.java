package exercise1;

public class Client {
    public static void main(String[] args) {
        Institution institution1, institution2, institution3, institution4;
        Office office1, office2, office3, office4, office5, office6, office7, office8;

        institution1 = new Institution("北京总部");
        institution2 = new Institution("湖南分校");
        institution3 = new Institution("长沙教学点");
        institution4 = new Institution("湘潭教学点");

        office1 = new Office("北京总部教务办公室");
        office2 = new Office("北京总部行政办公室");
        office3 = new Office("湖南分校教务办公室");
        office4 = new Office("湖南分校行政办公室");
        office5 = new Office("长沙教学点教务办公室");
        office6 = new Office("长沙教学点行政办公室");
        office7 = new Office("湘潭教学点教务办公室");
        office8 = new Office("湘潭教学点行政办公室");


        institution4.add(office7);
        institution4.add(office8);
        institution3.add(office5);
        institution3.add(office6);
        institution2.add(office3);
        institution2.add(office4);
        institution2.add(institution3);
        institution2.add(institution4);
        institution1.add(office1);
        institution1.add(office2);
        institution1.add(institution2);

        institution1.handleArchives();
    }
}
