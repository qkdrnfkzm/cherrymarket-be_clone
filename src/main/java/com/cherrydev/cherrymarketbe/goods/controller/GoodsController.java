package com.cherrydev.cherrymarketbe.goods.controller;

import com.cherrydev.cherrymarketbe.goods.dto.DiscountCalcDto;
import com.cherrydev.cherrymarketbe.goods.dto.GoodsBasicInfoDto;
import com.cherrydev.cherrymarketbe.goods.dto.GoodsRegistrationDto;
import com.cherrydev.cherrymarketbe.goods.service.GoodsService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/goods")
public class GoodsController {

    private final GoodsService goodsService;

    /* Insert */
    @PostMapping("/save")
    public void save(final @Valid @RequestBody GoodsRegistrationDto goodsRegistrationDto) {
        goodsService.save(goodsRegistrationDto);
    }
    /* Select */

    @GetMapping("listAll")
    public ResponseEntity<List<GoodsRegistrationDto>> getListAll() {
        return ResponseEntity.ok(goodsService.findAll());
    }

    @GetMapping("basicInfo")
    public ResponseEntity<DiscountCalcDto> getBasicInfo(@RequestParam Long goodsId){
        return ResponseEntity.ok(goodsService.findBasicInfo(goodsId));
    }

    // @GetMapping("/list")
    // public List<GoodsListDto> getList(){
    //     return goodsService.findAll();
    // }
    //
    // /* Delete */
    // @DeleteMapping("/delgoods")
    // @ResponseStatus(HttpStatus.CREATED)
    // public void delete(Long goodsId) {
    //     goodsService.deleteById(goodsId);
    // }

}
