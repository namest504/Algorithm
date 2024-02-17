SELECT
  o.seller_id as seller_id,
  COUNT(DISTINCT(o.order_id)) as orders
FROM
  olist_order_items_dataset as o
GROUP BY
  o.seller_id
HAVING
  orders >= 100
