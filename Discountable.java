interface Discountable {
    // In interfaces, methods are by default public and abstract
    // so those keywords arent needed
    public abstract float getMaximumDiscountPct();

    float getPersonDiscount();

    float getCorporateDiscount();
}