package lessons.lesson_22.task1Var2;

public class HerbalTea extends Tea{

    public HerbalTea(int teaId, TeaProducer teaProducer, String teaName) {

        super(teaId, teaProducer, teaName, "Herbal");
    }

    public void time(){
        System.out.println("Время заваривания 20 минут");
    }
}
