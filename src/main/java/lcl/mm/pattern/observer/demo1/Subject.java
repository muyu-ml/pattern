package lcl.mm.pattern.observer.demo1;

public interface Subject {
    /**
     * 注册一个观察者
     * @param o
     */
    public void registerObserver(MyObserver o);

    /**
     * 移除一个观察者
     * @param o
     */
    public void removeOberver(MyObserver o);

    /**
     * 通知观察者
     */
    public void notifyObserver();
}
