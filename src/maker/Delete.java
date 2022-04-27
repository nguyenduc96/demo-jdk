package maker;

public class Delete {
    @Deprecated
    public void delete(Object obj) {
        if (obj.getClass().isAnnotationPresent(MakerCustomAno.class) || obj instanceof MakerCustom) {
            System.out.println("No delete");
        } else {
            System.out.println("delele success");
        }
    }
}
