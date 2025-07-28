/**
 * @module line-height/index
 */
import { Plugin } from 'ckeditor5';
import { LineHeightEditing } from './editing.js';
import { LineHeightUI } from './ui.js';

const ATTRIBUTE = 'lineHeight';

class LineHeight extends Plugin {
	/**
	 * @inheritDoc
	 */
	static get requires() {
		return [LineHeightEditing, LineHeightUI];
	}

	/**
	 * @inheritDoc
	 */
	static get pluginName() {
		return 'LineHeight';
	}
}

export { ATTRIBUTE, LineHeightUI, LineHeightEditing, LineHeight };
