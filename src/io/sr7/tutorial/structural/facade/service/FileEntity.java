package io.sr7.tutorial.structural.facade.service;

public  class FileEntity extends  BaseEntity {
        private String name;
        private String path;

    public FileEntity(String name, String path) {
        this.name=name;
        this.path=path;
    }

    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }
    }