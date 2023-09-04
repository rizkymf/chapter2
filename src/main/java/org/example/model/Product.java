package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Product prevProduct; // null jika di pojok awal
    private Product nextProduct; // null jika di pojok akhir
    private Integer id;
    private String productName;
    private Integer harga;
}
