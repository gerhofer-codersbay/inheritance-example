package com.codersbay.gerhofer.zoo;

public enum AnimalCasing {
    FUR(true, false),
    EXOSKELETON(false, false),
    SCALES(false, true),
    FEATHERS(true, false),
    SKIN(false, true);

    AnimalCasing(boolean isCute, boolean isWaterproof) {
        this.isCute = isCute;
        this.isWaterproof = isWaterproof;
    }

    private boolean isCute;
    private boolean isWaterproof;

    public boolean isCute() {
        return isCute;
    }

    public boolean isWaterproof() {
        return isWaterproof;
    }
}
