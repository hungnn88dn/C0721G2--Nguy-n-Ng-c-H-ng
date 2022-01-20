package com.c0721g2srsrealestatebe.service.realestatenews;

import com.c0721g2srsrealestatebe.model.realestatenews.RealEstateNews;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IRealEstateNewsService {
    // TaiVD get history post - please dont delete my task
    // 5.5.4  List history post
    Page<RealEstateNews> findAllNewsBySearchField(String customerId,
                                                  String title,
                                                  String typeOfNew,
                                                  String realNewType,
                                                  Pageable pageable);


    // 5.6.3 show Real estate new detail
    Optional< RealEstateNews > findNewsById(String Id);

    // 5.6.2 add Real estate new detail
    RealEstateNews saveRealEstateNews(RealEstateNews realEstateNews);

    // 5.7.1 Xem danh sách nhu cầu - Method Tìm kiếm DoanhNV
    Page<RealEstateNews> searchRealEstateNewsByKindOfNewsAndRealEstateTypeAndDirection(Pageable pageable, String kindOfNews, String directionId, String realEstateTypeId);

    // 5.7.1 Xem danh sách nhu cầu - Method hiển thị List DoanhNV
    Page<RealEstateNews> findAllNewsPage(Pageable pageable);

    // 5.7.1 Xem danh sách nhu cầu - Method Không duyệt gọi Dialog DoanhNV
    Optional<RealEstateNews> findByIdOp(String id);

    // 5.7.1 Xem danh sách nhu cầu - Method Không duyệt gọi Dialog DoanhNV
    void deleteById(String id);

    // 5.6.1 KhaiPN
    Page<RealEstateNews> findAllRealEstateNewsByFilter(String address, String kindOfNews, String realEstateType, String direction, String minPrice, String maxPrice,Pageable pageable);
}



