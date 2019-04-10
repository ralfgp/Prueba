package com.example.salespartnerv21.db;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;

//CREATE TABLE [assembly_products](
//        [id] INTEGER NOT NULL REFERENCES assemblies([id]),
//        [product_id] INTEGER NOT NULL REFERENCES products([id]),
//        [qty] INTEGER NOT NULL,
//        CHECK(qty >= 0),
//        UNIQUE([id], [product_id]));

@Entity(tableName = "assembly_products")
public class AssemblyProducts {
    @ForeignKey(entity = Assemblies.class,
    parentColumns = "id",childColumns = "id")
    @ColumnInfo(name = "id")
    private int id;
    @ForeignKey(entity = Products.class,
            parentColumns = "id",childColumns = "product_id")
    @ColumnInfo(name = "product_id")
    private int product_id;
    @ColumnInfo(name = "qty")
    private int qty;
}
