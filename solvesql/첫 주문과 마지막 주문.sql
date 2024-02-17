SELECT
  DATE(MIN(order_purchase_timestamp)) as first_order_date,
  DATE(MAX(order_purchase_timestamp)) as last_order_date
FROM
  olist_orders_dataset