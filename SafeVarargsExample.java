class SafeVarargsExample {
    
    @SafeVarargs
    public <T> T[] max(T... objs) {
        return objs;
    }
}