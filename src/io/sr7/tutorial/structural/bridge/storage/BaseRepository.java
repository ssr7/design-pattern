package io.sr7.tutorial.structural.bridge.storage;

interface BaseRepository{
    public void save(BaseEntiy entiy);
    public StorageRepository getRepository();
} 