package com.example.bootmongocrud.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "database_sequences")
public class DatabaseSequence {

    @Id
    private String id;

    private long seq;

    public DatabaseSequence() {
    }

    public DatabaseSequence(String id, long seq) {
        this.id = id;
        this.seq = seq;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getSeq() {
        return seq;
    }

    public void setSeq(long seq) {
        this.seq = seq;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DatabaseSequence{");
        sb.append("id='").append(id).append('\'');
        sb.append(", seq=").append(seq);
        sb.append('}');
        return sb.toString();
    }
}
