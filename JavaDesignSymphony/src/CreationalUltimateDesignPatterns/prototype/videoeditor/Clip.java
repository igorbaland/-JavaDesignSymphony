package CreationalUltimateDesignPatterns.prototype.videoeditor;

public class Clip implements Component{
    @Override
    public Component clone() {
        return new Clip();
    }
}
