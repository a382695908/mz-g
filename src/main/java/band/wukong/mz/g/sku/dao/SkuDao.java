package band.wukong.mz.g.sku.dao;

import band.wukong.mz.g.sku.bean.Sku;
import org.nutz.dao.QueryResult;

import java.util.List;

/**
 * As you see...
 *
 * @author wukong(wukonggg@139.com)
 */
public interface SkuDao {

    /**
     * 保存Sku和more，如果发现没有对应goods，抛出异常
     *
     * @param s s
     * @return
     */
    Sku insertWithMore(Sku s);

    /**
     * find from db
     *
     * @param id id
     * @return
     */
    Sku findWithLinks(long id);

    /**
     * find from db
     *
     * @param sid sid
     * @return
     */
    Sku findWithLinks(String sid);


    /**
     * update
     *
     * @param s s
     */
    void updateWithMore(Sku s);

    /**
     * remove.只设置sku的状态。skumore不动
     *
     * @param id id
     */
    void rm(Long id);

    /**
     * 查询
     *
     * @param cateCode cateCode
     * @param qcond    qcond
     * @param pageNum  page number
     * @param pageSize page size
     * @return QueryResult 包含GoodsList和Page
     */
    QueryResult list(String cateCode, String qcond, int pageNum, int pageSize);

    /**
     * 根据goodsId找SKUList
     *
     * @param goodsId goodsId
     *
     * @return
     */
    List<Sku> listByGoodsId_STATE_NOT_RM(long goodsId);

    /**
     * 看goods对应的库存数量
     *
     * @param goodsId goodsId
     * @return
     */
    int countByGoodsId_STATE_NOT_RM(long goodsId);

}
