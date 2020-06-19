ALTER TABLE `kuriniai` ADD `rusis` ENUM('tapyba','skulptura') NOT NULL DEFAULT 'tapyba' AFTER `stilius`, ADD INDEX (`rusis`);

INSERT INTO `kuriniai`(`pav`, `rusis`, `stilius`, `metai_sukurimo`, `kaina` ) SELECT `Pavadinimas`, 'skulptura', `Stilius`, `Sukurtas metais`, `Kaina` FROM `skulpturos` WHERE 1

UPDATE `menininkai` SET `vardas`=CONCAT(`vardas`, ' ',`pavarde`) WHERE 1

ALTER TABLE `menininkai` CHANGE `vardas` `pav` VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL;

ALTER TABLE `kuriniai` ADD FOREIGN KEY (`id_menininkai`) REFERENCES `menininkai`(`id`) ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE `kuriniai` ADD FOREIGN KEY (`id_laikytojai`) REFERENCES `laikytojai`(`id`) ON DELETE RESTRICT ON UPDATE RESTRICT;